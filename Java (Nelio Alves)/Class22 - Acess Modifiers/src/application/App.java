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

        Product product = new Product(name, price);

        product.setName( "Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1199.90);
        System.out.println("Updated price: " + product.getPrice());
        product.setStock(5);
        System.out.println("Updated stock: " + product.getStock());

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
