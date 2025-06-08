package application;

import java.time.LocalDateTime;

import entities.Order;
import entities.enums.OrderStatus;

public class App {
    public static void main(String[] args) {
        Order order = new Order(1, LocalDateTime.now(), OrderStatus.PedingPayment);
        System.out.println(order);

        OrderStatus orderstatus = OrderStatus.valueOf("Delivered");
        System.out.println(orderstatus);
    }
}
