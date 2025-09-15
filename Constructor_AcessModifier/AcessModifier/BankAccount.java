class BankAccount {
    // Access modifiers
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods for private 'balance'
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + ", New Balance: ₹" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ", Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displaySavingsAccount() {
        // Accessing public and protected members
        System.out.println("Savings Account - Number: " + accountNumber + ", Holder: " + accountHolder + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("12345", "Aeshna", 50000, 5.5);
        sa.displayAccount();
        sa.displaySavingsAccount();

        sa.deposit(10000);
        sa.withdraw(2000);
    }
}
