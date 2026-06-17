package practice.OOP.Encapsulation;

public class BankAccount {
    private String accountId;
    private int balance;

    public BankAccount(String accountId) {
        this.accountId = accountId;
        this.balance = 0;
    }

    public String getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit success, balance " + balance + "dollars.");
        } else {
            System.out.println("Deposit amount need to greater than 0.");
        }
    }

    public void withdraw(int amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("Withdraw successful, balance " + balance + "dollars.");
        } else if (balance <= 0) {
            System.out.println("Withdraw amount need to greater than 0.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void printInfo() {
        System.out.println(accountId + "|" + balance);
    }


}
