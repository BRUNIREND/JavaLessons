package OOP.Incapsulation;

public class Main {
    public static void main(String[] args){
        BankAccount bank = new BankAccount();

        bank.setAccountHolder("Yaroslav");
        bank.deposit(100);
        bank.withdraw(50);
        System.err.println("Владелец: " + bank.getAccountHolder() + "Счет: " + bank.getBalance());
    }
}
