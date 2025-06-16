package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

    static Scanner read = new Scanner(System.in);
    static final DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    static SellerDao sellerDao = DaoFactory.createSellerDao();

    public static void main(String[] args) {
        
        while (true) {
            int action = menu();
            if(action == 0) break;
            else if(action == 1) insert();
            else if(action == 2) update();
            else if(action == 3) delete();
            else if(action == 4) findById();
            else if(action == 5) findByDepartment();
            else if(action == 6) findAll();
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
        System.out.println("5- Find by Departament");
        System.out.println("6- Find All");
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
        System.out.print("Enter email: ");
        String email = read.nextLine();
        System.out.print("Enter birthdate (DD/MM/YYYY): ");
        LocalDate birthdate = LocalDate.parse(read.nextLine(), dateformat);
        System.out.print("Enter base salary: $");
        Double baseSalary = read.nextDouble();
        System.out.print("Enter department id: ");
        Integer departmentId = read.nextInt();
        read.nextLine();

        Department department = new Department(departmentId, null);
        Seller seller = new Seller(null, name, email, birthdate, baseSalary, department);
        sellerDao.insert(seller);
    }

    public static void update(){
        System.out.print("Seller id: ");
        Integer id = read.nextInt();
        read.nextLine();
        System.out.print("Enter name: ");
        String name = read.nextLine();
        System.out.print("Enter email: ");
        String email = read.nextLine();
        System.out.print("Enter birthdate (DD/MM/YYYY): ");
        LocalDate birthdate = LocalDate.parse(read.nextLine(), dateformat);
        System.out.print("Enter base salary: $");
        Double baseSalary = read.nextDouble();
        System.out.print("Enter department id: ");
        Integer departmentId = read.nextInt();
        read.nextLine();

        Department department = new Department(departmentId, null);
        Seller seller = new Seller(id, name, email, birthdate, baseSalary, department);
        sellerDao.update(seller);
    }

    public static void delete(){
        System.out.print("Seller id: ");
        Integer id = read.nextInt();
        read.nextLine();

        sellerDao.deleteById(id);
    }

    public static void findById(){
        System.out.print("Seller id: ");
        Integer id = read.nextInt();
        read.nextLine();

        Seller seller = sellerDao.findById(id);
        System.out.println(seller);
    }

    public static void findByDepartment(){
        System.out.print("Enter department id: ");
        Integer departmentId = read.nextInt();
        read.nextLine();
        Department department = new Department(departmentId, null);

        List<Seller> sellers = sellerDao.findByDepartment(department);
        for(Seller seller : sellers) System.out.println(seller);
    }

    public static void findAll(){
        List<Seller> sellers = sellerDao.findAll();
        for(Seller seller : sellers) System.out.println(seller);
    }
}
