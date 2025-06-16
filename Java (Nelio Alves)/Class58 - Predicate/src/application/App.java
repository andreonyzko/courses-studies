package application;

import java.util.ArrayList;
import java.util.List;
// import java.util.function.Predicate;

import entities.Product;
// import util.ProductPredicate;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("RX 7600", 1700));
        products.add(new Product("Ryzen 7 5700X", 900));
        products.add(new Product("A520M Tuf Gaming", 520));
        products.add(new Product("1TB NVME 6000Mbps", 320));
        for(Product product : products) System.out.println(product);

        // IMPLEMENTAÇÃO DA INTERFACE
        // products.removeIf(new ProductPredicate());

        // MÉTODO ESTÁTICO
        // products.removeIf(Product::test);

        // MÉTODO NÃO ESTÁTICO
        // products.removeIf(Product::test2);

        // Expressão lambda declarada
        // Predicate<Product> test = p -> p.getPrice() >= 900;
        // products.removeIf(test);

        products.removeIf(p-> p.getPrice() >= 900);

        System.out.println();
        for(Product product : products) System.out.println(product);
    }
}
