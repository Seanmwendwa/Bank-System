package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;
import java.util.Calendar;

public class DepositTransaction extends BaseTransaction {

    public DepositTransaction(int amount, @NotNull Calendar date) {
        super(amount, date);
    }

    /**
     * Verifies if the deposit amount is valid.
     * @param amt The deposit amount.
     * @return true if the deposit amount is positive, false otherwise.
     */
    private boolean checkDepositAmount(int amt) {
        return amt > 0;
    }

    /**
     * Prints the details of the deposit transaction.
     */
    public void printTransactionDetails() {
        System.out.println("Deposit Transaction: " + this.toString());
    }

    /**
     * Applies the deposit to the bank account by adding the amount to the account balance.
     * @param ba The bank account to which the deposit will be applied.
     */
    public void apply(BankAccount ba) {
        if (checkDepositAmount(getAmount())) {
            double curr_balance = ba.getBalance();
            double new_balance = curr_balance + getAmount();
            ba.setBalance(new_balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Specifications
    // Precondition: The deposit amount must be positive.
    // Postcondition: The deposit amount is added to the bank account balance.
    // Invariant: The deposit amount should always be positive.
}
