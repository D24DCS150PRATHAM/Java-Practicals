class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message)
    {super(message);
    }
}

public class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Khate me Balance nahi hai!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1200);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}