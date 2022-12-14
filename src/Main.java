public class Main {
    public static void main(String[] args) {
        ChildBankAccount account = new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(8000);
        account.depositMoney(-200);
        System.out.println("Balance: " + account.getBalance());

        Countries name = new Countries("Russia");
        name.setExitToSea(true);
        name.setPopulation(150000);
        name.setSquare(366787345);

        System.out.println("Страна: " + name.getCountriesName());
        System.out.println("Площадь: " + name.getSquare());
        System.out.println("Выход к морю: " + name.getIsExitToSea());
        System.out.println("Население: " + name.getPopulation());
    }

}