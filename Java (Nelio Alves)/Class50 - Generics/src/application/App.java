package application;

import java.util.Scanner;

import services.PrintService;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.print("How many numbers will be entered? ");
        int n = read.nextInt();
        read.nextLine();

        PrintService<String> ps = new PrintService<>();

        for(int i=0; i<n; i++){
            String value = read.nextLine();
            ps.addValue(value);
        }

        System.out.println("\nFirst: " + ps.first());
        System.out.print("List: " + ps.print());

        read.close();
    }
}
