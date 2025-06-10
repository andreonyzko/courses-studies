package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;
import entities.Shape;
import entities.Square;
import entities.enums.ShapeColor;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        Locale.setDefault(Locale.US);

        System.out.println("Enter square datas:");
        System.out.print("Color: ");
        String color = read.nextLine().toUpperCase().trim();
        System.out.print("Side value: ");
        shapes.add(new Square(ShapeColor.valueOf(color), read.nextDouble()));
        read.nextLine();

        System.out.println("\nEnter rectangle datas:");
        System.out.print("Color: ");
        color = read.nextLine().toUpperCase().trim();
        System.out.print("Base value: ");
        double base = read.nextDouble();
        System.out.print("Height: ");
        double height = read.nextDouble();
        shapes.add(new Rectangle(ShapeColor.valueOf(color), base, height));

        System.out.println("\nSHAPE AREAS:");
        for(Shape shape : shapes){
            System.out.printf("%.2f\n", shape.area());
        }

        read.close();
    }
}
