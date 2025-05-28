package exercises;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter N value: ");
        int n = read.nextInt();

        for(int i=0; i<n; i++){
            System.out.print("\nEnter three decimal numbers: ");
            double a = read.nextDouble();
            double b = read.nextDouble();
            double c = read.nextDouble();
            double media = (a*2 + b*3 + c*5) / 10;
            System.out.printf("Media: %.1f\n", media);
        }

        read.close();
    }
}
