package application;

import java.util.ArrayList;
import java.util.List;
// import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
// import util.ProductFunction;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("RX 7600", 1700));
        products.add(new Product("Ryzen 7 5700X", 900));
        products.add(new Product("A520M Tuf Gaming", 520));
        products.add(new Product("1TB NVME 6000Mbps", 320));
        for(Product product : products) System.out.println(product);

        // IMPLEMENTAÇÃO DA INTERFACE FUNCTION
        // List<String> names = products.stream().map(new ProductFunction()).collect(Collectors.toList());

        // MÉTODO ESTÁTICO
        // List<String> names = products.stream().map(Product::apply).collect(Collectors.toList());

        // MÉTODO NÃO ESTÁTICO
        // List<String> names = products.stream().map(Product::apply2).collect(Collectors.toList());

        // LAMBDA DECLARADA
        // Function<Product, String> apply = (p) -> p.getName().toUpperCase();
        // List<String> names = products.stream().map(apply).collect(Collectors.toList());

        List<String> names = products.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        
        System.out.println();
        for(String name : names) System.out.println(name);
    }
}
