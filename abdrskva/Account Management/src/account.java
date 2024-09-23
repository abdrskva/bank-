class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private sum[] transactions;
    private int transactionCount;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new sum[100];
        this.transactionCount = 0;
    }

    public void deposit(double sum) {
        sum transaction = new sum(sum, TransactionType.DEPOSIT);
        transactions[transactionCount++] = transaction;
        balance += sum;
    }

    public void withdraw(double sum) {
        if (sum <= balance) {
            sum transaction = new sum(sum, TransactionType.WITHDRAWAL);
            transactions[transactionCount++] = transaction;
            balance -= sum;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printTransactionHistory() {
        for (int i = 0; i < transactionCount; i++) {
            System.out.println(transactions[i].transactionType + ": " + transactions[i].sum);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}