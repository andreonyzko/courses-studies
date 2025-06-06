package application;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter product data: ");

        System.out.print("\nName: ");
        String name = read.nextLine();
        System.out.print("Price: $");
        double price= read.nextDouble();
        System.out.print("Stock: ");
        int stock = read.nextInt();

        Product product = new Product(name, price, stock);

        System.out.println("Product data: " + product);

        System.out.print("\n\nEnter the number of products to be added in stock: ");
        product.addStock(read.nextInt());

        System.out.println("Updated data: " + product);

        System.out.print("\n\nEnter the number of products to be remove from stock: ");
        product.remStock(read.nextInt());

        System.out.println("Updated data: " + product);

        read.close();
    }
}
