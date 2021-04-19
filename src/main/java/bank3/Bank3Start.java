package bank3;

public class Bank3Start {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setAccountNumber("David's account");
        account1.setBalance(500);
        BankAccount account2 = new BankAccount();
        account2.setAccountNumber("Stranger's account");
        account2.setBalance(600);
        BankAccount account3 = new BankAccount();
        account3.setAccountNumber("Poor man's account ");
        account3.setBalance(0);
        BankAccount account4 = new BankAccount();
        BankAccount account5 = new BankAccount();

        new BankAccount().transfer(100, account1, account2);
        new BankAccount().transfer(900, account1, account2);
        new BankAccount().calculateInterest(5, 500);
        new BankAccount().deposit(300, account3);
    }
}
