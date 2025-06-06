import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        // Raiz quadrada
        System.out.println("Square root = " + Math.sqrt(number));
        
        // Expoente
        int exp;
        System.out.print("Enter an exponent: ");
        exp = sc.nextInt();
        System.out.println("Potentiation = " + Math.pow(number, exp));
        
        // Absolute
        System.out.print("Enter a negative number: ");
        number = sc.nextInt();
        System.out.println("Number's absolute: " + Math.abs(exp));
        sc.close();
    }
}
