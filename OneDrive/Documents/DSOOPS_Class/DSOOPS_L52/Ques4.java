package DSOOPS_L52;

public class Ques4 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1000);

        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.checkBalance();

    }
}

class BankAccount {
    private double balance; 

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal!");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
