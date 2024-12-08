package Lecture4_interfaces_abstract_classes;

import org.jetbrains.annotations.NotNull;
import java.util.Calendar;

public class WithdrawalTransaction extends BaseTransaction {

    public WithdrawalTransaction(int amount, @NotNull Calendar date) {
        super(amount, date);
    }

    /**
     * Verifies if the withdrawal amount is valid (i.e., non-negative).
     * @param amt The withdrawal amount.
     * @return true if the withdrawal amount is positive, false otherwise.
     */
    private boolean checkWithdrawalAmount(int amt) {
        return amt > 0;
    }

    /**
     * Reverses the withdrawal transaction by applying a reverse withdrawal.
     * @return true if the reversal was successful, false otherwise.
     */
    public boolean reverse() {
        // Logic for reversing a withdrawal (e.g., refunding the money)
        return true;
    }

    /**
     * Prints the details of the withdrawal transaction.
     */
    public void printTransactionDetails() {
        System.out.println("Withdrawal Transaction: " + this.toString());
    }

    /**
     * Applies the withdrawal to the bank account by subtracting the amount from the account balance.
     * @param ba The bank account from which the withdrawal will be made.
     */
    public void apply(BankAccount ba) {
        if (checkWithdrawalAmount(getAmount())) {
            double curr_balance = ba.getBalance();
            if (curr_balance >= getAmount()) {
                double new_balance = curr_balance - getAmount();
                ba.setBalance(new_balance);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Specifications
    // Precondition: The withdrawal amount must be positive, and the account balance must be sufficient.
    // Postcondition: The withdrawal amount is subtracted from the bank account balance.
    // Invariant: The withdrawal amount should always be positive.
}
