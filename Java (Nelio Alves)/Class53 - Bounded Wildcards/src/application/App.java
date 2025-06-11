package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        List<Integer> myInts = new ArrayList<>();
        List<Double> myDoubles = new ArrayList<>();
        List<Object> myObj = new ArrayList<>();

        System.out.print("How many ints will be entered? ");
        int amount = read.nextInt();

        for(int i=0; i<amount; i++){
            myInts.add(read.nextInt());
        }

        System.out.print("How many doubles will be entered? ");
        amount = read.nextInt();

        for(int i=0; i<amount; i++){
            myDoubles.add(read.nextDouble());
        }

        copy(myInts, myObj);
        copy(myDoubles, myObj);
        print(myObj);
        
        read.close();
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for(Number number : source) destiny.add(number);
    }

    public static void print(List<?> list){
        System.out.println("\nLIST: ");
        for(Object obj : list) System.out.print(obj + " ");
        System.out.println();
    }
}
