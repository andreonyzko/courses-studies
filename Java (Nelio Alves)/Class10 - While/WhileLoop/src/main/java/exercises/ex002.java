package exercises;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int x=1, y=1;

        while(x != 0 && y != 0){
            System.out.print("\nEnter x coord: ");
            x = read.nextInt();
            System.out.print("Enter y coord: ");
            y = read.nextInt();

            if(x > 0 && y > 0) System.out.println("First square");
            else if(x < 0 && y > 0) System.out.println("Second square");
            else if(x < 0 && y < 0) System.out.println("Third square");
            else if(x > 0 && y < 0) System.out.println("Fourth square");
        }

        read.close();
    }
}
