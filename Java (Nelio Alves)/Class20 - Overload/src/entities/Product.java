package entities;

public class Product {
    public String name;
    public double price;
    public int stock;

    public Product(){}

    public Product(String name, double price){
        this.name = name;
        this.price = price;
        stock = 0;
    }
    
    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double TotalValue(){
        return price*stock;
    }

    public void addStock(int num){
        stock += num;
    }

    public void remStock(int num){
        stock -= num;
    }

    @Override
    public String toString(){
        return name
            + ", $ " + String.format("%.2f", price)
            + ", " + stock + " units, "
            + "Total : $ " + String.format("%.2f", stock*price);
    }
}
