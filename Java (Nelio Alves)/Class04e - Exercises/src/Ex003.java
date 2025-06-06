import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        
        System.out.print("Enter third number: ");
        c = sc.nextInt();
        
        System.out.print("Enter fourth number: ");
        d = sc.nextInt();
        
        System.out.println("Difference = " + (a*b - c*d));
        
        sc.close();
    }
    
}
