package br.com.mariojp.solid.lspaccounts;

public class BankService {

    public void processWithdrawal(Account account, double amount) {
        if(account instanceof Withdrawable withdrawableAccount) {
            withdrawableAccount.withdraw(amount);
        }
      
    }
}
