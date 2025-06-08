package entities;

public final class BusinessAccount extends Account {
    private double loanLimit;

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit) balance += amount - 10;
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2;
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append(super.toString());
        response.append("Loan Limit: $" + String.format("%.2f", loanLimit));

        return response.toString();
    }
}
