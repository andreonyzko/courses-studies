package challenge01.application;

import java.util.Scanner;

import challenge01.entities.Rent;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Rent rooms[] = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int rentAmount = read.nextInt();
        
        for(int i=0; i < rentAmount; i++){
            read.nextLine();
            System.out.println("\nRent #" + (i+1));

            System.out.print("Name: ");
            String name = read.nextLine();

            System.out.print("Email: ");
            String email = read.nextLine();

            System.out.print("Room: ");
            rooms[read.nextInt()-1] = new Rent(name, email);
        }

        System.out.println("\nBusy rooms: ");
        for(int i=0; i<rooms.length; i++){
            if(rooms[i] != null){
                System.out.printf("%d: %s\n", (i+1), rooms[i]);
            }
        }

        read.close();
    }
}
