package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();
    
    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        return list.get(0);
    }

    public String print(){
        StringBuilder response = new StringBuilder();
        response.append("[ ");
        for(T number : list) response.append(number + " ");
        response.append("]");
        return response.toString();
    }
}
