import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter N value: ");
        int n = read.nextInt();

        for(int i=1; i<=n; i++){
            System.out.printf("\n%d %d %d", i, (int)Math.pow(i,2), (int)Math.pow(i,3));
        }

        read.close();
    }
}
