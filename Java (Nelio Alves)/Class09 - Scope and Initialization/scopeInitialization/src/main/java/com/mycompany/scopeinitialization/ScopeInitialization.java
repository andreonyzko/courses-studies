package com.mycompany.scopeinitialization;

import java.util.Scanner;

public class ScopeInitialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //NO INITIALIZATION ERROR
        //  double price;
        //  System.out.println(price);
        
        // SCOPE ERROR
        // Disccount varible may not be initialized, so it can't be printed
        //  double price = 400.00;
        //  if(price > 200){
        //      double disccount = price*0.1;
        //  }
        //  System.out.println(disccount);
        
        // IN THIS CASE, DISCCOUNT IS BEING VIEWED BY EVERYONE, AND IN ANY CASE IT'S INITIALIZED
        System.out.print("Enter the price: ");
        double price= sc.nextDouble();
        double disccount;
        
        if(price < 200.00){
            disccount = price*0.1;
        }
        else{
            disccount = 0;
        }
        
        System.out.println("Disccount: $" + disccount);
    }
}
