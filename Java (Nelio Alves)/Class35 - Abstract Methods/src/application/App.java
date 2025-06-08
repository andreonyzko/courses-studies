package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("How many shapes will be entered? ");
        int shapesAmount= read.nextInt();
        read.nextLine();

        for(int i=0; i < shapesAmount; i++){
            System.out.println("\nShape #" + (i+1) + " data:");
            System.out.print("Rectangle or Circle? ");
            String type = read.nextLine().toLowerCase().trim();
            System.out.print("Color (Black/Blue/Red): ");
            Color color = Color.valueOf(read.nextLine().toUpperCase().trim());

            if(type.equals("rectangle")){
                System.out.print("Width: ");
                double width = read.nextDouble();
                System.out.print("Height: ");
                double height = read.nextDouble();
                read.nextLine();
                shapes.add(new Rectangle(color, width, height));
            }
            else if(type.equals("circle")){
                System.out.print("Radius: ");
                double radius = read.nextDouble();
                read.nextLine();
                shapes.add(new Circle(color, radius));
            }
            else{
                System.out.println("Invalid shape!");
            }
        }

        System.out.println("\nSHAPES AREAS: ");
        for(Shape shape : shapes){
            System.out.printf("%.2f\n", shape.area());
        }

        read.close();
    }
}
