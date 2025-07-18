package model.entities;

import model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance, withdrawLimit;
    
    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException{
        if(amount > withdrawLimit) throw new DomainException("The amount exceeds withdraw limit");
        if(balance < amount) throw new DomainException("Not enough balance");
        balance -= amount;
    }
    
    @Override
    public String toString() {
        return "ACCOUNT DETAILS\n"
        + "[" + number + "] "
        + holder
        + "\nBalance: $"
        + String.format("%.2f", balance)
        + "\nWithdraw Limit: $"
        + String.format("%.2f", withdrawLimit);
    }
}
