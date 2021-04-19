package bank;

public class BankAccount {
    private double saldo;
    private double rentePercentage;
    private IBAN iban;


    public BankAccount(double saldo, double rentePercentage, IBAN iban) {
        this.saldo = saldo;
        this.rentePercentage = rentePercentage;
        this.iban = iban;
    }

    public boolean withdraw(double amount) {
        if (amount < 0){
            throw new RuntimeException("Withdrawel amount must be positive!");
        }
        if (this.saldo - amount > 0) {
            this.saldo -= amount;
            return true;
        } else {
            return false;
        }

    }

    public double deposit(double amount){
        if (amount < 0) throw new RuntimeException("Deposit amount must be positive!");
        saldo += amount;
        return saldo;
    }

    public double berekenRente (){
        return saldo * rentePercentage;

    }

    public double renteToegevoegd (){
        saldo += berekenRente();
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRentePercentage() {
        return rentePercentage;
    }

    public IBAN getIban() {
        return iban;
    }
}
