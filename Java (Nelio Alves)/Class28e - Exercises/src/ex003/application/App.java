package ex003.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ex003.entities.Client;
import ex003.entities.Order;
import ex003.entities.OrderItem;
import ex003.entities.Product;
import ex003.entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) {
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner read = new Scanner(System.in);

        System.out.println("\nEnter client data: ");
        System.out.print("Name: ");
        String clientName = read.nextLine();
        System.out.print("Email: ");
        String clientEmail = read.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        LocalDate clientBirthDate = LocalDate.parse(read.nextLine(), dateformat);

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("\nEnter order data: ");
        System.out.print("Status: ");
    
        Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(read.nextLine().toUpperCase()), client);

        System.out.println("\nHow many items to this order? ");
        int amountItems = read.nextInt();
        read.nextLine();

        for(int i=0; i<amountItems; i++){
            System.out.println("\nEnter #" + (i+1) + " item data:");
            System.out.print("Product Name: ");
            String productName = read.nextLine();
            System.out.print("Product Price: ");
            double productPrice = read.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = read.nextInt();
            read.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }

        dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("\nORDER SUMMARY");
        System.out.println(order);
        read.close();
    }
}
