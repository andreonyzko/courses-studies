package part1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.print("\nEnter array size: ");
        int array[] = new int[read.nextInt()];
        
        System.out.println();

        for(int i=0; i<array.length; i++){
            System.out.print((i+1) + "st value: ");
            array[i] = read.nextInt();
        }

        System.out.println();

        System.out.print("Array: [ ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.print("]");

        // ---------------------------------------

        System.out.print("\nEnter array size: ");
        double array2[] = new double[read.nextInt()];

        System.out.println();

        for(int i=0; i<array2.length; i++){
            System.out.print((i+1) + "st value: ");
            array2[i] = read.nextDouble();
        }

        double average=0;

        for(int i=0; i<array2.length; i++){
            average += array2[i];
        }

        System.out.println("\nAVERAGE: " + String.format("%.2f", average/array2.length));

        read.close();
    }
}
