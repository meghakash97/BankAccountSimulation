public class SavingsAccount extends BankAccount {
    private double interestRate; // percentage

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 500) { // Maintain minimum balance of 500
            System.out.println("Cannot withdraw: Minimum balance of 500 must be maintained.");
        } else {
            super.withdraw(amount);
        }
    }

    public void applyInterest() {
        double interest = (balance * interestRate) / 100;
        deposit(interest);
        System.out.println("Interest of " + interest + " applied.");
    }
}
