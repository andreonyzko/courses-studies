package services;

public class USAInterestService implements InterestService{
    private double interestRate;

    public USAInterestService(double interestRate) {
        this.interestRate = interestRate / 100;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
