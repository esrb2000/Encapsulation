public class Main {
    public static void main(String[] args) {
        ChildBankAccount account = new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(8000);
        account.depositMoney(-200);
        System.out.println("Balance: " + account.getBalance());
    }
}