package ex001.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ex001.entities.Product;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        String path = "src\\ex001\\file.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String fields[] = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            
            double average = products.stream().map(x -> x.getPrice()).reduce(0.0, (x,y) -> x + y) / products.size();
            System.out.println("Average price: $" + String.format("%.2f", average));

            products.stream().filter(x -> x.getPrice() < average).forEach(x -> System.out.println(x.getName()));
        } 
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
