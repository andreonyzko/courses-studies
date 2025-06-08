package entities;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(int number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance *= 1+(interestRate/100);
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append(super.toString());
        response.append("Interest Rate: " + interestRate + "%");

        return response.toString();
    }
}
