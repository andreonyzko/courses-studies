
package com.mycompany.dataprocessing;

public class DataProcessing {

    public static void main(String[] args) {
        // Example 1
        int x, y;
        x= 5;
        y= 2 * x;
        System.out.printf("x= %d, y= %d \n", x, y);
        
        // Example 2
        double z = 2 * x;
        System.out.printf("x= %d, z= %f \n", x, z);
        
        // Example 3
        double b, B, h, area;
        b= 6.0;
        B= 8.0;
        h= 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println("Area = " + area);
        
        // Example 4
        int a;
        double result;
        a= 5;
        result = (double) a / b; // casting
        System.out.println("Result = " + result);
        
        // Example 5
        double d = 5.0;
        int e = (int) d;
        System.out.println("e = " + e);
    }
}
