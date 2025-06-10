package entities;

public class Invoice {
    private double basicPayment, tax;

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double getBasicPayment() {
        return basicPayment;
    }
    
    public void setBasicPayment(double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public Double getTotalPayment(){
        return basicPayment + tax;
    }

    @Override
    public String toString() {
        return "INVOICE"
        + "\nBasic Payment: $" + String.format("%.2f", basicPayment)
        + "\nTax: $" + String.format("%.2f", tax)
        + "\nTotal: $" + String.format("%.2f", getTotalPayment());
    }
}
