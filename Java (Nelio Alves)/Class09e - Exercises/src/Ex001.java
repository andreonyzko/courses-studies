import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        int password = 2002;
        int input = 0;
       
        while(input != password){
            System.out.print("\nEnter password: ");
            input = read.nextInt();

            if(input == password) System.out.println("Acess granted.");
            else System.out.println("Incorrect password.");
        }

        read.close();
    }
}
