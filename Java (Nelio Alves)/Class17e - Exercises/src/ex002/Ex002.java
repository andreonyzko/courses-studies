package ex002;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Emplooye emplooye = new Emplooye();

        System.out.print("\nName: ");
        emplooye.name = read.nextLine();

        System.out.print("Gross salary: $");
        emplooye.grossSalary = read.nextDouble();

        System.out.print("Tax: $");
        emplooye.tax= read.nextDouble();

        System.out.println("Emplooye: " + emplooye);

        System.out.print("Which percentage to increase salary? ");
        emplooye.increaseSalary(read.nextDouble());

        System.out.println("Updated data: " + emplooye);

        read.close();
    }
}
