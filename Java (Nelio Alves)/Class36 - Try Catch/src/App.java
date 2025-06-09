import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter some names: ");
        String names[] = read.nextLine().trim().split(" ");

        for(int i = 0; i < names.length; i++) System.out.println(i + "- " + names[i]);

        try{
            System.out.print("\nEnter a position: ");
            int position = read.nextInt();

            System.out.println(position + "- " + names[position]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\nError: " + e.getMessage());
        }
        catch(java.util.InputMismatchException e){
            System.out.println("\nError: invalid integer");
        }

        System.out.println("\nEnd of Program");
        
        read.close();
    }
}
