import java.util.Scanner;

public class App {
    static Scanner read = new Scanner(System.in);
    static String names[];

    public static void main(String[] args){
        method1();
        read.close();
        System.out.println("End of Program");
    }

    public static void method1(){
        System.out.println("***METHOD1 START***");
        System.out.print("Enter some names: ");
        names = read.nextLine().trim().split(" ");

        for(int i = 0; i < names.length; i++) System.out.println(i + "- " + names[i]);
        method2();
        System.out.println("***METHOD1 END***");
    }

    public static void method2(){
        System.out.println("***METHOD2 START***");

        try{
            System.out.print("Enter a position: ");
            int position = read.nextInt();

            System.out.println(position + "- " + names[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Error: invalid input");
        }

        System.out.println("***METHOD2 END***");
    }
}
