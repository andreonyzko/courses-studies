package application;

import entities.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");

        System.out.println("c1 hashcode: " + c1.hashCode());
        System.out.println("c2 hashcode: " + c2.hashCode());
        System.out.println("c1 equals c2: " + c1.equals(c2));

        Client c3 = new Client("Maria", "maria@gmail.com");
        System.out.println("c3 hashcode: " + c1.hashCode());
        System.out.println("c1 equals c3: " + c1.equals(c3));
    }
}
