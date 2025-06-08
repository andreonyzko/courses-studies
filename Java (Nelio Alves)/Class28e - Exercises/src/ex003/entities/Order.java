package ex003.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import ex003.entities.enums.OrderStatus;

public class Order {
    static DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;
    
    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum=0;
        for(OrderItem item : items) sum += item.subtotal();
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();

        response.append("Order moment: " + moment.format(dateformat) + "\n");
        response.append("Order status: " + status.toString().toLowerCase() + "\n");
        response.append("Client: " + client + "\n");
        response.append("Order items: \n");
        for(OrderItem item : items){
            response.append(item + "\n");
        }
        response.append("Total price: $" + String.format("%.2f", total()));

        return response.toString();
    }
}
