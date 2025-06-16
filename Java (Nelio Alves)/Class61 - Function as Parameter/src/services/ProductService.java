package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {
    public static double filteredSum(List<Product> products, Predicate<Product> predicate){
        double sum = 0;

        for(Product product : products){
            if(predicate.test(product)){
                sum += product.getPrice();
            }
        }

        return sum;
    }
}
