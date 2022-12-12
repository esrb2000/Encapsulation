public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount() {
        this.balance = 0.0;
    }

    public ChildBankAccount (double maxBalance) {
        this.maxBalance = maxBalance;
    }
    public boolean depositMoney(double value) {
       while (balance < maxBalance) {
           balance = balance + value;
        }
        return true;
    }
    public double getBalance() {
        return balance;
    }
}
