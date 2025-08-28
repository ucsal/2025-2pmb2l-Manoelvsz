package br.com.mariojp.solid.lspaccounts;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount();
        checking.deposit(100);
        new BankService().processWithdrawal(checking, 30);
        System.out.println("Checking balance: " + checking.getBalance()); // 70

        SavingsAccount savings = new SavingsAccount();
        savings.deposit(100);
        new BankService().processWithdrawal(savings, 30); // não faz nada
        System.out.println("Savings balance: " + savings.getBalance()); // 100
    }
}
