package application;

import java.util.ArrayList;
import java.util.List;
// import java.util.function.Consumer;

import entities.Product;
// import util.ProductConsumer;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("RX 7600", 1700));
        products.add(new Product("Ryzen 7 5700X", 900));
        products.add(new Product("A520M Tuf Gaming", 520));
        products.add(new Product("1TB NVME 6000Mbps", 320));
        for(Product product : products) System.out.println(product);

        // IMPLEMENTAÇÃO DA INTERFACE CONSUMER
        // products.forEach(new ProductConsumer());

        // MÉTODO ESTÁTICO
        // products.forEach(Product::accept);

        // MÉTODO NÃO ESTÁTICO
        // products.forEach(Product::accept2);

        // LAMBDA DECLARADA
        // Consumer<Product> accept = p -> p.setPrice(p.getPrice() * 0.85);
        // products.forEach(accept);

        products.forEach(p -> p.setPrice(p.getPrice() * 0.85));

        System.out.println("\n15% OFF:");
        for(Product product : products) System.out.println(product);
    }
}
