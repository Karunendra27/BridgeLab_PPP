// Superclass
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass 1
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass 3
class FixedDepositAccount extends BankAccount {
    int depositTerm; 

    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }
}


public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("SA123", 5000.0, 4.5);
        CheckingAccount c1 = new CheckingAccount("CA456", 3000.0, 1000.0);
        FixedDepositAccount f1 = new FixedDepositAccount("FD789", 10000.0, 12);

        s1.displayAccountType();
        System.out.println();
        c1.displayAccountType();
        System.out.println();
        f1.displayAccountType();
    }
}
