package bank;

public class BankAppMain {

    public static void main(String[] args) {

        BankClient bc1 = new BankClient("Jip");
        BankClient bc2 = new BankClient("Jan");
        BankClient bc3 = new BankClient("Neke");

        //System.out.println(bc.getKlantNaam());

        IBAN ib1 = new IBAN("ABC123");
        IBAN ib2 = new IBAN("DEF456");
        IBAN ib3 = new IBAN("GHI789");

        BankAccount baSaldo1 = new BankAccount(100.00, 0.05, ib1);
        BankAccount baSaldo2 = new BankAccount(200.00, 0.06, ib2);
        BankAccount baSaldo3 = new BankAccount(300.00, 0.07, ib3);



        //IBAN ibanObj = baSaldo.getIban();

        //System.out.println(baSaldo.getSaldo());
        //System.out.println(ibanObj.getIbanInDezeClass());
    }
}
