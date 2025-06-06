package entities;
public class Product {
    public String name;
    public double price;
    public int stock;

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
