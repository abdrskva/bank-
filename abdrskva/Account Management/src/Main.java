

public class Main {
    public static void main(String[] args) {
        Account account = new Account(12345, "Alice Smith");
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(100);
        account.deposit(300);

        System.out.println("Current Balance: $" + account.getBalance());
        System.out.println("Transaction History:");
        account.printTransactionHistory();
    }
}
