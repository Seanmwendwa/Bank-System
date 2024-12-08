import Lecture4_interfaces_abstract_classes.*; // Import all classes from Lecture4_interfaces_abstract_classes package

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void testDepositTransaction() {
        Calendar d1 = new GregorianCalendar(); // d1 is an Object [Objects are Reference types]
        DepositTransaction deposit = new DepositTransaction(1000, d1); // amount and d1 are arguments

        System.out.println("Deposit Transaction Details:");
        System.out.println("Amount: " + deposit.getAmount());
        System.out.println("Date: " + deposit.getDate().getTime());
        System.out.println("Transaction ID: " + deposit.getTransactionID());

        deposit.printTransactionDetails();
    }

    public static void testWithdrawalTransaction() {
        Calendar d1 = new GregorianCalendar(); // d1 is an Object [Objects are Reference types]
        WithdrawalTransaction withdrawal = new WithdrawalTransaction(500, d1); // amount and d1 are arguments

        System.out.println("Withdrawal Transaction Details:");
        System.out.println("Amount: " + withdrawal.getAmount());
        System.out.println("Date: " + withdrawal.getDate().getTime());
        System.out.println("Transaction ID: " + withdrawal.getTransactionID());

        withdrawal.printTransactionDetails();
    }

    public static void testTransactions() {
        // Testing DepositTransaction
        testDepositTransaction();

        // Testing WithdrawalTransaction
        testWithdrawalTransaction();
    }

    public static void main(String[] args) {
        // This is the client code
        // Uncomment the following line to test the Deposit and Withdrawal transactions
        testTransactions();
    }
}
