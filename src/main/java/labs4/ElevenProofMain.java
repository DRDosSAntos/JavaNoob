package labs4;

import java.util.Scanner;

public class ElevenProofMain {

    public static void main(String[] args) {

        System.out.println("Please input your account number:");
        Scanner in = new Scanner(System.in);
        String accountNumber = in.nextLine();
    }

    public void maxLenght(String accountNumber) {
        if (accountNumber.length() > 5) throw new IllegalArgumentException("Account number must be 5 digits");

    }

    int sum;

    public void total(int sum) {
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public int sum(String accountNumber) {
        try {
            for (int i = 1; i <= accountNumber.length(); i++) {
                String digit = accountNumber.charAt(i - 1) + "";
                sum = sum + Integer.parseInt(digit) * (accountNumber.length() + 1 - i);
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Account number is not valid");
        }
        return sum;
    }

    public void check(int sum) {
        if (sum % 11 == 0) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
            throw new IllegalArgumentException("Invalid account number");

        }
    }
}
