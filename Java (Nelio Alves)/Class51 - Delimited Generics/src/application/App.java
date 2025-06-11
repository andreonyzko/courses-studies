package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.CalculationService;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();
        String path = "src\\file.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while(line != null){
                String fields[] = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            for(Product product : products) System.out.println(product);

            Product max = CalculationService.max(products);

            System.out.println("\nMore expansive: " + max);
        } 
        catch(IOException e){
            System.out.println("Error at opening file");
        }
        catch (Exception e) {
            System.out.println("Unexpected error");
        }
    }
}
