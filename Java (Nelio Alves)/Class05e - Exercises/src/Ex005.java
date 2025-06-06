import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1- Hotdog ($4.00)");
        System.out.println("2- XSalad ($4.50)");
        System.out.println("3- XBacon ($5.00)");
        System.out.println("4- Simple Toast ($2.00)");
        System.out.println("5- Soda ($1.50)");
        while(true){
            System.out.print("Enter food id: ");
            int cod = sc.nextInt();
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            if(cod == 1){
                System.out.printf("\nTotal: $%.2f", amount*4.0);
            }
            else if (cod == 2){
                System.out.printf("\nTotal: $%.2f", amount*4.5);
            }
            else if (cod == 3){
                System.out.printf("\nTotal: $%.2f", amount*5.0);
            }
            else if (cod == 4){
                System.out.printf("\nTotal: $%.2f", amount*2.0);
            }
            else if (cod == 5){
                System.out.printf("\nTotal: $%.2f", amount*1.5);
            }
            else{
                break;
            }
        }
        
        sc.close();
    }
    
}
