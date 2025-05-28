package exercises;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x=0, a= 0, g=0, d=0;

        while(x != 4){
            System.out.println("=-=-=- Combustível -=-=-=-=");
            System.out.println("1- Álcool");
            System.out.println("2- Gasolina");
            System.out.println("3- Diesel");
            System.out.println("4- Sair");
            x = read.nextInt();

            if(x == 1) a++;
            else if(x == 2) g++;
            else if(x == 3) d++;
            else if(x == 4) continue;
            else System.out.println("Invalid code, please insert another:");
        }

        System.out.println("\nMUITO OBRIGADO!");
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);

        read.close();
    }
}
