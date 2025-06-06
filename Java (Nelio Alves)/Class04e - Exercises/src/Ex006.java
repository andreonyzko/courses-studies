import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        
        System.out.print("Enter three float numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        System.out.println("=-=-=- AREAS -=-=-=");
        System.out.printf("Triangle: %.3f\n", a*c/2);
        System.out.printf("Circle: %.3f\n", Math.pow(c,2)*3.14159);
        System.out.printf("Trapeze: %.3f\n", (a+b)*c/2);
        System.out.printf("Square: %.3f\n", Math.pow(b,2));
        System.out.printf("Retangle: %.3f\n", a*b);
        
        sc.close();
    }
    
}
