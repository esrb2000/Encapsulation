public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount() {
        this.balance = 0.0;
    }

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        double chekBalance = balance + value;
        if (chekBalance < maxBalance) {
            balance = balance + value;
            return true;
        } else {
            balance = balance;
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }
}

