package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("How many numbers will be entered? ");
        int amount = read.nextInt();

        for(int i = 0; i < amount; i++) numbers.add(read.nextInt());

        print(numbers);

        read.close();
    }

    public static void print(List<?> list){
        System.out.println();
        System.out.println("List: ");
        for(Object obj : list) System.out.print(obj + " ");
    }
}
