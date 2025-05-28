package com.mycompany.bitwise;

import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        int n1 = 89, n2 = 60;

        System.out.println(n1&n2);
        System.out.println(n1|n2);
        System.out.println(n1^n2);

        Scanner read = new Scanner(System.in);
        int n = read.nextInt(), mask=32;

        if((n&mask) != 0) System.out.println("6th bit is true!");
        else System.out.println("6th bit is false!");

        read.close();
    }
}
