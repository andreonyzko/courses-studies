package service;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> products){
        if(products.isEmpty()) throw new IllegalStateException("List can't be empty!");

        T max = products.get(0);

        for(T product : products){
            if(product.compareTo(max) > 0){
                max = product;
            }
        }

        return max;
    }
}
