package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    private IBAN iban = new IBAN("ABC123");

    @Test
    public void testWithdraw() {
        // Given
        BankAccount bankAccount= new BankAccount(500, 0.05,iban);

        // When
        boolean success = bankAccount.withdraw(100);

        // Then
        assertTrue(success);
        assertEquals(400.00, bankAccount.getSaldo(), 0.01);
    }

    @Test
    public void testWithdrawTooMuch() {
        // Given
        BankAccount bankAccount= new BankAccount(500, 0.05,iban);

        // When
        boolean success = bankAccount.withdraw(600);

        // Then
        assertFalse(success);
        assertEquals(500.00, bankAccount.getSaldo(), 0.01);
    }

    @Test
    public void testWithdrawNegativeAmount() {
        // Given
        BankAccount bankAccount= new BankAccount(500, 0.05,iban);

        // When
        assertThrows(RuntimeException.class, ()->{
            boolean success = bankAccount.withdraw(-100);
        });

        // Then
        assertEquals(500.00, bankAccount.getSaldo(), 0.01);
    }

    public void testDeposit() {
        // Given

        // When

        // Then
    }

    public void testBerekenRente() {
    }

    public void testRenteToegevoegd() {
    }

    public void testGetRentePercentage() {
    }
}