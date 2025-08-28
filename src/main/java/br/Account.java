package br;

public abstract class Account {
    protected double balance = 0;

    public void deposit(double amount) {
        if(amount <= 0) throw new IllegalArgumentException("Depósito deve ser positivo");
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
