package ex001;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Retangule retangule = new Retangule();

        System.out.print("\nEnter retangule width and height: ");
        retangule.width = read.nextDouble();
        retangule.height = read.nextDouble();

        System.out.println("AREA = " + retangule.area());
        System.out.println("PERIMETER = " + retangule.perimeter());
        System.out.println("DIAGONAL = " + retangule.diagonal());

        read.close();
    }
}
