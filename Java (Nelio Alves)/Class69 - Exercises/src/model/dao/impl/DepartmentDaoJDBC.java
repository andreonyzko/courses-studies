package model.dao.impl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection db = null;

    public DepartmentDaoJDBC(Connection db){
        this.db = db;
    }

    @Override
    public void insert(Department obj) {
        PreparedStatement st = null;
        
        try {
            st = db.prepareStatement("INSERT INTO department(Name) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getName());

            int rowsAffecteds = st.executeUpdate();

            if(rowsAffecteds > 0){
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()) obj.setId(rs.getInt(1));
                DB.closeResultSet(rs);
            }
            else throw new DbException("No rows created");
        } 
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Department obj) {
        PreparedStatement st = null;

        try {
            st = db.prepareStatement("UPDATE department SET Name = ? WHERE Id = ?");
            st.setString(1, obj.getName());
            st.setInt(2, obj.getId());
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
    public void deletebyId(Integer id) {
        PreparedStatement st = null;

        try {
            st = db.prepareStatement("DELETE FROM department WHERE Id = ?");
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
    public Department findById(Integer id) {
        Statement st = null;
        ResultSet rs = null;

        try {
            st = db.createStatement();
            rs = st.executeQuery("SELECT * FROM department WHERE Id = " + id);

            if(rs.next()){
                return instantiateDepartment(rs);
            }
            else return null;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Department> findAll() {
        List<Department> departments = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;

        try {
            st = db.createStatement();
            rs = st.executeQuery("SELECT * FROM department");

            while(rs.next()){
                departments.add(instantiateDepartment(rs));
            }

            return departments;
        } 
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally{
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException{
        return new Department(rs.getInt("Id"), rs.getString("Name"));
    }
}
