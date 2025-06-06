import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter N value: ");
        int n = read.nextInt();

        System.out.println("Divisores:");
        for(int i=1; i<=n; i++){
            if(n%i == 0) System.out.print(i + " ");
        }

        read.close();
    }
}
