import java.util.*;
//interface
interface Loanable {
    void applyForLoan(double amount);
    String calculateLoanEligibility();
}
//abstract class 
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient funds!");
    }

    public abstract double calculateInterest();
}
//subclasses
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }
    
    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied: Rs " + amount);
    }
    @Override
    public String calculateLoanEligibility() {
        return "Eligible for up to Rs " + getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int acc, String name, double bal) {
        super(acc, name, bal);
    }
    @Override

    public double calculateInterest() {
        return getBalance() * 0.02;
    }
    @Override

    public void applyForLoan(double amount) {
        System.out.println("Loan applied: Rs " + amount);
    }
    @Override

    public String calculateLoanEligibility() {
        return "Eligible for up to Rs " + getBalance() * 3;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(1001, "Aman", 50000));
        accounts.add(new CurrentAccount(1002, "Nehal", 70000));

        for (BankAccount acc : accounts) {
            System.out.println(acc.getHolderName() + "Interest: " + acc.calculateInterest());
            ((Loanable)acc).applyForLoan(20000);
            System.out.println(((Loanable)acc).calculateLoanEligibility());
        }
    }
}
