package application;

import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();
        products.add(new Product("Ryzen 5700X3D", 1300.00));
        products.add(new Product("RX 7600      ", 1699.90));
        products.add(new Product("WC LE500", 400.00));

        // USANDO COLLECTIONS
        // Collections.sort(products);

        // USANDO CLASSE QUE IMPLEMENTA A INTERFACE COMPARATOR
        // products.sort(new MyComparator());

        // USANDO CLASSE ANONIMA
        // Comparator<Product> comp = new Comparator<Product>() {
        //     @Override
        //     public int compare(Product p1, Product p2) {
        //         return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //     }
        // };
        // products.sort(comp);

        // USANDO ARROW FUNCTION / LAMBDA
        // Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        // products.sort(comp);

        // PASSANDO A ARROW FUNCTION POR PARAMETRO
        products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        System.out.println("PRODUCT" + "\t\tPRICE");
        for(Product product : products) System.out.println(product);
    }
}
