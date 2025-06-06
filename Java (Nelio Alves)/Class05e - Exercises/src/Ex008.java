import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.printf("%.2f\n", salary);

            if(salary < 0){
                break;
            }
            else if(salary <=2000){
                System.out.println("Insent");
            }
            else if(salary <= 3000){
                System.out.printf("Tribute 8%%: R$%.2f\n", salary*8/100);
            }
             else if(salary <= 4500){
                System.out.printf("Tribute 18%%: R$%.2f\n", salary*18/100);
            }
             else{
                System.out.printf("Tribute 28%%: R$%.2f\n", salary*28/100);
            }
        }
        
        sc.close();
    }
    
}
