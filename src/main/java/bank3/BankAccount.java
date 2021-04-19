package bank3;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private double interestRate;

//    public BankAccount(String accountNumber, double balance, double interestRate) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//        this.interestRate = interestRate;
//    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double amount, BankAccount target){
        balance = (balance + amount);
        System.out.println("Deposit complete. New balance on " + target.accountNumber + "is: " + balance);

    }

    public void withdraw(double amount){
        balance = (balance - amount);

    }

    public void transfer (int amount, BankAccount from, BankAccount to){
        if (from.balance > amount ){
            from.balance = from.balance - amount;
            to.balance = to.balance + amount;
            System.out.println("transfer successful. new balance on " + to.accountNumber + "is: " + to.balance);
        } else {
            System.out.println("Insufficient funds, transfer cannot be completed. max. transferable balance on " + from.accountNumber + "is: " + from.balance);
        }
    }

    public void calculateInterest(double interestRate, double balance){
        balance = (balance + ((balance / 100) * interestRate));
        System.out.println("Your balance plus interest rate after 1 year is: " + balance);
    }
}
