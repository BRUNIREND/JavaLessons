package OOP.Incapsulation;

public class BankAccount {
    private String accountHolder = "";
    private double balance = 0;

    public String getAccountHolder(){
        return accountHolder;
    }


    public void setAccountHolder(String name){
        this.accountHolder = name;
    }

    public double getBalance(){
        return balance;
    }

    
    public void deposit(double amount){
        if (amount >= 0) {
            this.balance += amount;
        }else{
            System.out.println("Введите корректное значение");
        }
    } 

    public void withdraw(double amount){
        if (amount <= this.balance) {
            this.balance -= amount;
        }else{
            System.out.println("Введите корректное значение");
            
        }
    }
}
