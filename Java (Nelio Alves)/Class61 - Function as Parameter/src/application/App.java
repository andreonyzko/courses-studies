package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import services.ProductService;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        products.add(new Product("RX 7600", 1700));
        products.add(new Product("Ryzen 7 5700X", 900));
        products.add(new Product("A520M Tuf Gaming", 520));
        products.add(new Product("1TB NVME 6000Mbps", 320));
        for(Product product : products) System.out.println(product);

        System.out.print("\nEnter the first products letter wich do u want sum prices: ");
        char letter = read.next().toUpperCase().charAt(0);

        System.out.printf("\nSum: $%.2f", ProductService.filteredSum(products, p -> p.getName().toUpperCase().charAt(0) == letter));

        read.close();
    }
}
