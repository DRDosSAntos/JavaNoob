package bank2;

public class Bank2 {
   private String accountNumber;
   private double balance;
   private String customerName;
   private String eMail;
   private int phoneNumber;

   public Bank2(String accountNumber, double balance, String customerName, String eMail, int phoneNumber){

       this.accountNumber = accountNumber;
       this. customerName = customerName;
       this.eMail = eMail;
       this.phoneNumber = phoneNumber;
   }

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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance = this.balance + depositAmount;
        System.out.println("Deposit of " + depositAmount + " completed. New balance: " + (this.balance + depositAmount));

    }

    public void withdraw(double withdrawAmount){
        if (this.balance - withdrawAmount <0){
            System.out.println("Insufficient funds to complete withdrawal of: " + withdrawAmount + " available balance: " + this.balance);
        } else {this.balance -= withdrawAmount;
        System.out.println("Withdrawal amount of: " + withdrawAmount + "complete, remaining balance is: " + this.balance);}
    }
}
