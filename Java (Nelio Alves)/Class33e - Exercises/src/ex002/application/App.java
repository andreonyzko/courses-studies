package ex002.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ex002.entities.ImportedProduct;
import ex002.entities.Product;
import ex002.entities.UsedProduct;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("\nHow many products will be entered? ");
        int amountProducts = read.nextInt();
        read.nextLine();

        for(int i=0; i<amountProducts; i++){
            System.out.println("\nProduct #" + (i+1) + " data:");
            System.out.print("Common, used or imported? ");
            String type = read.nextLine().toLowerCase().trim();
            System.out.print("Name: ");
            String name = read.nextLine();
            System.out.print("Price: $");
            double price = read.nextDouble();
            read.nextLine();

            if(type.equals("common")){
                products.add(new Product(name, price));
            }
            else if(type.equals("used")){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(read.nextLine(), dateformat);
                products.add(new UsedProduct(name, price, date));
            }
            else if(type.equals("imported")){
                System.out.print("Customs fee: $");
                double customFee = read.nextDouble();
                read.nextLine();
                products.add(new ImportedProduct(name, price, customFee));
            }
            else{
                System.out.println("Invalid product type.");
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for(Product product : products){
            System.out.println(product.priceTag());
        }

        read.close();
    }
}
