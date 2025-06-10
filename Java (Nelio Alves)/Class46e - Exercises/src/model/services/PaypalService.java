package model.services;

public class PaypalService implements OnlinePaymentService{
    private static final Double FEE_PERCENTAGE = 0.02, MONTHLY_INTEREST = 0.01;

    @Override
    public double interest(Double amount, Integer months) {
        return amount*MONTHLY_INTEREST*months;
    }

    @Override
    public double paymentFee(Double amount) {
        return amount*FEE_PERCENTAGE;
    }
}
