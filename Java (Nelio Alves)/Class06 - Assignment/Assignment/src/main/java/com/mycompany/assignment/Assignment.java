package com.mycompany.assignment;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int minutes = sc.nextInt();
       double account = 50.0;
       
       if(minutes > 100){
           account += (minutes - 100) * 2.0;
       }
       
       System.out.printf("Account Value = $%.2f\n", account);
       
       // ---------------------------------
       // Extra
       
       System.out.print("Enter a number: ");
       int num = sc.nextInt();
       System.out.print("Enter another number: ");
       int num2 = sc.nextInt();
       
       System.out.printf("%d += %d\t\t", num, num2);
       num += num2;
       System.out.print(num + "\n");
       
       System.out.printf("%d -= %d\t\t", num, num2);
       num -= num2;
       System.out.print(num + "\n");
       
       System.out.printf("%d *= %d\t\t", num, num2);
       num *= num2;
       System.out.print(num + "\n");
       
       System.out.printf("%d /= %d\t\t", num, num2);
       num /= num2;
       System.out.print(num + "\n");
       
       System.out.printf("%d %%= %d\t\t", num, num2);
       num %= num2;
       System.out.print(num + "\n");
       
       sc.close();
    }
}
