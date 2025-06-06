import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter N value: ");
        int n = read.nextInt(), in=0, out=0, value;

        for(int i=0; i<n; i++){
            value = read.nextInt();
            if(value > 9 && value < 21) in++;
            else out++;
        }

        System.out.printf("\n%d in interval", in);
        System.out.printf("\n%d out of interval", out);

        read.close();
    }
}
