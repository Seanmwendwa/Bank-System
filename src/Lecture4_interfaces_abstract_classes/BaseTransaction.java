package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;
import java.util.Calendar;

public abstract class BaseTransaction implements TransactionInterface {
    private final int amount;
    private final Calendar date;
    private final String transactionID;

    /**
     * Constructor for BaseTransaction class
     * @param amount The transaction amount, must be positive.
     * @param date The date of the transaction, must not be null and must be a valid Calendar object.
     */
    public BaseTransaction(int amount, @NotNull Calendar date) {
        this.amount = amount;
        this.date = (Calendar) date.clone();  // Defensive copying to avoid external modification
        int uniq = (int) (Math.random() * 10000);  // Generate a unique ID
        this.transactionID = date.toString() + uniq;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public Calendar getDate() {
        return (Calendar) date.clone();  // Defensive copying
    }

    public String getTransactionID() {
        return transactionID;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void printTransactionDetails();
    public abstract void apply(BankAccount ba);

    // Specifications
    // Precondition: amount must be positive and date must be a valid Calendar object.
    // Postcondition: A valid transaction is created with a unique transaction ID.
    // Invariant: Amount must always be positive; transaction ID must be unique.
}
