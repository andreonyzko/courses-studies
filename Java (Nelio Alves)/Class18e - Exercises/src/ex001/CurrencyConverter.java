package ex001;

public class CurrencyConverter {
    public static double dollarPrice;

    public static double dollarToReal(double dollar){
        return dollar*(dollarPrice*1.06);
    }
}
