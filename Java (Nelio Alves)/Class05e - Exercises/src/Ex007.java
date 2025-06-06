import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter x exis: ");
            double x = sc.nextDouble();
            
            System.out.print("Enter y exis: ");
            double y = sc.nextDouble();
            
            if(x > 0 && y > 0){
                System.out.println("Q1");
            }
            else if( x < 0 && y > 0){
                System.out.println("Q2");
            }
            else if( x < 0 && y < 0){
                System.out.println("Q3");
            }
            else if( x > 0 && y < 0){
                System.out.println("Q4");
            }
            else if( x == 0 && y == 0){
                System.out.println("Origin");
                break;
            }
        }
        
        sc.close();
    }
    
}
