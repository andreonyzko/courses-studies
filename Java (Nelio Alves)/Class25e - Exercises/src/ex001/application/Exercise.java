package ex001.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex001.entities.Emplyoee;

public class Exercise {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Emplyoee> emplooyes = new ArrayList<>();
        
        System.out.print("How many employees will be registered? ");
        int amount = read.nextInt();
        read.nextLine();
        
        for(int i=0; i<amount; i++){
            System.out.println("\nEmplyoee #" + (i+1));
            
            System.out.print("Id: ");
            int id = read.nextInt();
            read.nextLine();
            
            System.out.print("Name: ");
            String name = read.nextLine();
            
            System.out.print("Salary: ");
            double salary = read.nextDouble();
           
            emplooyes.add(new Emplyoee(id, name, salary));
        }
        
        System.out.print("\nEnter the employee id that will have salary increase: ");
        int indexEmplooye = FindEmplooye(emplooyes, read.nextInt());
        if(indexEmplooye == -1 ) System.out.println("This id does not exists!");
        else{
            System.out.print("\nEnter the percentenge: ");
            emplooyes.get(indexEmplooye).SalaryIncrease(read.nextDouble());
        }
        
        PrintList(emplooyes);

        read.close();
    }
    
    public static int FindEmplooye(List<Emplyoee> emplooyes, int id){
        for(int i=0; i<emplooyes.size(); i++){
            if(emplooyes.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    public static void PrintList(List<Emplyoee> emplooyes){
        System.out.println("\nList of employees: ");
        for(Emplyoee e : emplooyes) System.out.printf("%d, %s, %.2f\n", e.getId(), e.getName(), e.getSalary());
    }
}
