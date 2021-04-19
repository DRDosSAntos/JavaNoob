package bank2;

public class BankStart {
    public static void main(String[] args) {
        Bank2 test = new Bank2("NL12INGB3456789", 300, "David", "daviddossant@yahoo.com", 12345);
//        test.setAccountNumber("NL12INGB3456789");
//        test.seteMail("david@gmail.com");
//        test.setCustomerName("David");
//        test.setPhoneNumber(123456789);
        test.deposit(500);
        test.withdraw(250);
        test.withdraw(300);
    }
}
