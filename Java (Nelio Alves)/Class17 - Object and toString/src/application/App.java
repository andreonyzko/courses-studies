package application;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Product product = new Product();

        System.out.print("\nEnter product data: ");

        System.out.print("\nName: ");
        product.name = read.nextLine();
        System.out.print("Price: $");
        product.price = read.nextDouble();
        System.out.print("Stock: ");
        product.stock = read.nextInt();

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
