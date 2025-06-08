package entities;

public class Account {
    protected int number;
    protected String holder;
    protected double balance;

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Account: " + number + "\n");
        response.append("Holder: "+ holder + "\n");
        response.append("Balance: $" + String.format("%.2f", balance) + "\n");

        return response.toString();
    }
}
