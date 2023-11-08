class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    // Constructor
    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters and setters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(int amount) {
        this.balance += amount;
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }



    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("John Doe", 123456789, 7000);

        // Withdraw and deposit
        account.withdraw(2000);
        account.deposit(1000);

        // Get balance
        int balance = account.getBalance();
        System.out.println("Current Balance: " + balance);

        // Determine status using ternary operator
        String status = (balance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";

        // Display status
        System.out.println("Status: " + status);
    }
}
