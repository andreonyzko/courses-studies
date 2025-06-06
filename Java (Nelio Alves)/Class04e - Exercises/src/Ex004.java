import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, hours;
        double income;
        
        System.out.print("Enter funcionary id: ");
        id = sc.nextInt();
        
        System.out.print("Enter the hours worked: ");
        hours = sc.nextInt();
        
        System.out.print("Enter funcionary hour value: ");
        income = sc.nextDouble();
        
        System.out.println("FUNCIONARY " + id);
        System.out.println("SALARY: U$" + income*hours);
        
        sc.close();
    }
    
}
