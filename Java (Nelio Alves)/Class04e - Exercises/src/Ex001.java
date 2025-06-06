import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b;
        System.out.print("Enter first number: ");
        a = sc.nextDouble();
        System.out.print("Enter second number: ");
        b = sc.nextDouble();
        
        System.out.printf("Sum: %.1f + %.1f = %.2f", a, b, a+b);
        
        sc.close();
    }
    
}
