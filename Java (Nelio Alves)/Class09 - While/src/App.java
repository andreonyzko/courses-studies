import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter a number to sum: ");
        int x = read.nextInt();
        int sum= 0;

        while(x != 0){
            sum += x;
            System.out.print("Enter another number to add to sum (zero to exit): ");
            x = read.nextInt();
        }

        System.out.printf("Result of sum is %d", sum);

        read.close();
    }
}
