package exercise;

public class Product {
    String name;
    double price;
    int stock;

    public String productData(){
        return name + ", $" + price + ", " + stock + " units, Total: $" + TotalValue();
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
}
