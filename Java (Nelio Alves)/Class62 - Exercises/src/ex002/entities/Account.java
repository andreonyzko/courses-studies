package ex002.entities;

public class Account {
    private String holder, email;
    private double balance;
    
    public Account(String holder, String email, double balance) {
        this.holder = holder;
        this.email = email;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
