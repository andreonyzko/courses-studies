package application;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Map<Product, Double> stock = new HashMap<>();

        System.out.print("How many products will be entered? ");
        int amountProducts = read.nextInt();
        read.nextLine();

        for(int i=0; i<amountProducts; i++){
            System.out.println("\nPRODUCT #" + (i+1));
            System.out.print("Name: ");
            String productName = read.nextLine();
            System.out.print("Price: $");
            double productPrice = read.nextDouble();

            System.out.print("Stock: ");
            int productStock = read.nextInt();
            read.nextLine();
            stock.put(new Product(productName, productPrice), productPrice*productStock);
        }

        System.out.println("\nTOTAL STOCK VALUE:");
        for(Product product : stock.keySet()){
            System.out.println(product.getName() + ": $" + String.format("%.2f", stock.get(product)));
        }

        read.close();
    }
}
