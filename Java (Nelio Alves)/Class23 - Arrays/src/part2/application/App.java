package part2.application;

import java.util.Scanner;

import part2.entities.Product;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter amount products: ");
        Product products[] = new Product[read.nextInt()];
        read.nextLine();

        for(int i=0; i<products.length; i++){
            System.out.println();
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Price: $");
            products[i] = new Product(name, read.nextDouble());
            read.nextLine();
            System.out.println("Registered product: " + products[i]);
        }

        double averagePrice = 0;
        for(int i=0; i<products.length; i++){
            averagePrice += products[i].getPrice();
        }

        System.out.printf("\nAverage price: $%.2f", averagePrice/products.length);

        read.close();
    }
}
