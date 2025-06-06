package entities;

public class Order {
    private String date;
    private Product product;

    public Order(String date, Product product) {
        this.date = date;
        this.product = product;
        product.name = "TV";
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    
}
