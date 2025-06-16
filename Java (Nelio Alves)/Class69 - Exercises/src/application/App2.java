package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class App2 {

    static Scanner read = new Scanner(System.in);
    static DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    public static void main(String[] args) {
        
        while (true) {
            int action = menu();
            if(action == 0) break;
            else if(action == 1) insert();
            else if(action == 2) update();
            else if(action == 3) delete();
            else if(action == 4) findById();
            else if(action == 5) findAll();
            else System.out.println("Invalid action, try again.");
        }

        read.close();
    }

    public static int menu(){
        System.out.println("\n=-=-=-=-=-=- MENU -=-=-=-=-=-=");
        System.out.println("1- Insert");
        System.out.println("2- Update");
        System.out.println("3- Delete");
        System.out.println("4- Find by Id");
        System.out.println("5- Find All");
        System.out.println("0- Exit");
        System.out.print("Action: ");
        int action = read.nextInt();
        read.nextLine();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        return action;
    }

    public static void insert(){
        System.out.print("Enter name: ");
        String name = read.nextLine();

        Department department = new Department(null, name);
        departmentDao.insert(department);
    }

    public static void update(){
        System.out.print("Department id: ");
        Integer id = read.nextInt();
        read.nextLine();
        System.out.print("Enter new name: ");
        String name = read.nextLine();

        Department department = new Department(id, name);
        departmentDao.update(department);
    }

    public static void delete(){
        System.out.print("Department id: ");
        Integer id = read.nextInt();
        read.nextLine();

        departmentDao.deletebyId(id);
    }

    public static void findById(){
        System.out.print("Department id: ");
        Integer id = read.nextInt();
        read.nextLine();

        Department department = departmentDao.findById(id);
        System.out.println(department);
    }

    public static void findAll(){
        List<Department> departments = departmentDao.findAll();
        for(Department department : departments) System.out.println(department);
    }
}
