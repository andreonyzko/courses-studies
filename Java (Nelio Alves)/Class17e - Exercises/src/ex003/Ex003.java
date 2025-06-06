package ex003;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        Student student = new Student();

        System.out.print("\nName: ");
        student.name = read.nextLine();

        System.out.print("1st Grade: ");
        student.grade1 = read.nextDouble();

        System.out.print("2st Grade: ");
        student.grade2 = read.nextDouble();

        System.out.print("3st Grade: ");
        student.grade3 = read.nextDouble();

        double finalGrade = student.finalGrade();
        System.out.println("FINAL GRADE = " + finalGrade);

        if(finalGrade < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60.0-finalGrade);
        }
        else System.out.println("PASS");

        read.close();
    }
}
