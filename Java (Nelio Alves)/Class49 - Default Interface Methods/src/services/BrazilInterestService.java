package services;

public class BrazilInterestService implements InterestService{
    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate / 100;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
