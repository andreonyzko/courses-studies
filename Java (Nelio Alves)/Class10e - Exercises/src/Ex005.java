import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter N value: ");
        int n= read.nextInt(), fatorial=1;

        for(int i=n; i>0; i--){
            fatorial *= i;
        }

        System.out.printf("Result: %d", fatorial);

        read.close();
    }
}
