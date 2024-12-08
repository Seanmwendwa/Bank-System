package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;

import java.util.Calendar;

public class BaseTransaction implements TransactionInterface {
    private final int amount;
    private final Calendar date;
    private final String transactionID;

    /**
     * Constructor for BaseTransaction
     * @param amount in an integer
     * @param date: Not null, and must be a Calendar object
     */
    public BaseTransaction(int amount, @NotNull Calendar date)  {
        this.amount = amount;
        this.date = (Calendar) date.clone();
        int uniq = (int) (Math.random() * 10000);
        transactionID = date.toString() + uniq;
    }

    /**
     * Get the amount of the transaction
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Get the date of the transaction
     * @return a cloned Calendar object representing the transaction date
     */
    public Calendar getDate() {
        return (Calendar) date.clone(); // Defensive copying to preserve the original date
    }

    /**
     * Get the unique transaction ID
     * @return the transaction ID
     */
    public String getTransactionID(){
        return transactionID;
    }

    /**
     * Print the transaction details (implemented here as a simple print)
     */
    public void printTransactionDetails() {
        System.out.println("Transaction ID: " + getTransactionID());
        System.out.println("Amount: " + getAmount());
        System.out.println("Date: " + getDate().getTime());
    }

    /**
     * Apply this transaction to the bank account
     * @param ba the bank account to apply the transaction to
     */
    public void apply(BankAccount ba) {
        // In a concrete class, we might apply the transaction to the bank account here
        // Example: update the balance based on the transaction type (deposit/withdrawal)
    }
}
