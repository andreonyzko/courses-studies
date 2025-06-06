import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        if(number%2 == 0){
            System.out.println("It's a pair number!");
        }
        else{
            System.out.println("It's an odd number!");
        }
        
        sc.close();
    }
    
}
