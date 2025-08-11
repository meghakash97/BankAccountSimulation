public class Main {
    public static void main(String[] args) {
        // Create a savings account object
        SavingsAccount acc1 = new SavingsAccount("101", "Soumya Mohanty", 2000, 5);

        // Perform transactions
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.applyInterest();
        acc1.withdraw(1900); // Should show minimum balance warning

        // Show the transaction history
        acc1.printTransactionHistory();
    }
}
