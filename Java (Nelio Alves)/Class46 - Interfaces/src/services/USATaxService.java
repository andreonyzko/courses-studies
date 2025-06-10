package services;

public class USATaxService implements TaxService {
    @Override
    public Double tax(Double amount) {
        if(amount <= 100) return amount*0.1;
        else return amount*0.075;
    }
}
