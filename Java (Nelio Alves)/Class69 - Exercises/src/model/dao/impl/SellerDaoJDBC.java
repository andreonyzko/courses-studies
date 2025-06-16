package model.dao.impl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

    private Connection db;

    public SellerDaoJDBC(Connection db){
        this.db = db;
    }

    @Override
    public void insert(Seller obj) {
        PreparedStatement st = null;

        try {
            st = db.prepareStatement("INSERT INTO seller " +
            "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +
            "VALUES (?, ?, ?, ?, ?)",
            Statement.RETURN_GENERATED_KEYS);

            st.setString(1, obj.getName());
            st.setString(2, obj.getEmail());
            st.setDate(3, java.sql.Date.valueOf(obj.getBirthDate()));
            st.setDouble(4, obj.getBaseSalary());
            st.setInt(5, obj.getDepartament().getId());

            int rowsAffecteds = st.executeUpdate();
            if(rowsAffecteds > 0){
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()) obj.setId(rs.getInt(1));
                DB.closeResultSet(rs);
            }
            else throw new DbException("No rows affecteds!");
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Seller obj) {
        PreparedStatement st = null;

        try {
            st = db.prepareStatement(
                "UPDATE seller SET " +
                "Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? " +
                "WHERE Id = ?"
                );
            
            st.setString(1, obj.getName());
            st.setString(2, obj.getEmail());
            st.setDate(3, java.sql.Date.valueOf(obj.getBirthDate()));
            st.setDouble(4, obj.getBaseSalary());
            st.setInt(5, obj.getDepartament().getId());
            st.setInt(6, obj.getId());

            st.executeUpdate();
        } 
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;

        try {
            st = db.prepareStatement("DELETE FROM seller WHERE Id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } 
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public Seller findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            st = db.prepareStatement("SELECT seller.*, department.Name as DepName " +
            "FROM seller JOIN department " +
            "ON seller.DepartmentId = department.Id " +
            "WHERE seller.Id = ?");
            st.setInt(1, id);

            rs = st.executeQuery();

            if(rs.next()){
                Department dep = instantiateDepartment(rs);
                return instantiateSeller(rs, dep);
            }
            else return null;
        }
        catch(SQLException e){
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Seller> findAll() {
        List<Seller> sellers = new ArrayList<>();
        Map<Integer, Department> departaments = new HashMap<>();

        Statement st = null;
        ResultSet rs = null;

        try {
            st = db.createStatement();
            rs = st.executeQuery("SELECT seller.*, department.Name as DepName " +
            "FROM seller JOIN department " +
            "ON seller.DepartmentId = department.Id " +
            "ORDER BY seller.Id");

            while(rs.next()){
                Integer depId = rs.getInt("DepartmentId");
                Department dep = departaments.get(depId);
                if (dep == null){
                    dep = instantiateDepartment(rs);
                    departaments.put(depId, dep);
                };
                sellers.add(instantiateSeller(rs, dep));
            }

            return sellers;
        } 
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
    @Override
    public List<Seller> findByDepartment(Department department) {
        List<Seller> sellers = new ArrayList<>();
        Map<Integer, Department> departaments = new HashMap<>();

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = db.prepareStatement(
                "SELECT seller.*, department.Name as DepName " +
                "FROM seller JOIN department ON seller.DepartmentId = department.Id " +
                "WHERE seller.DepartmentId = ? " +
                "ORDER BY seller.Id");

            st.setInt(1, department.getId());

            rs = st.executeQuery();

            while(rs.next()){
                Integer depId = rs.getInt("DepartmentId");
                Department dep = departaments.get(depId);
                if (dep == null){
                    dep = instantiateDepartment(rs);
                    departaments.put(depId, dep);
                };
                sellers.add(instantiateSeller(rs, dep));
            }

            return sellers;
        } 
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

     private Department instantiateDepartment(ResultSet rs) throws SQLException{
        return new Department(rs.getInt("DepartmentId"), rs.getString("DepName"));
    }

    private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException{
        return new Seller(
            rs.getInt("Id"), 
            rs.getString("Name"), 
            rs.getString("Email"), 
            rs.getDate("BirthDate").toLocalDate(), 
            rs.getDouble("BaseSalary"), 
            dep);
    }
}
