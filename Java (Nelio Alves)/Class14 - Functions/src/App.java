import java.util.Scanner;

public class App {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        higher();
    }

    public static void higher(){
        int numbers[] = get();

        int higher = numbers[0];
        if(numbers[1] > higher) higher = numbers[1];
        if(numbers[2] > higher) higher = numbers[2];

        print(higher);
    } 

    public static int[] get(){
        int numbers[] = new int[3];
        System.out.print("\nEnter first number: ");
        numbers[0] = read.nextInt();
        System.out.print("Enter second number: ");
        numbers[1] = read.nextInt();
        System.out.print("Enter thrid number: ");
        numbers[2] = read.nextInt();

        return numbers;
    }

    public static void print(int higherNumber){
        System.out.printf("\nHigher number is %d\n", higherNumber);
        read.close();
    }
}
