package OOP.Interface;

public class CryptoPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        if (amount <= 100){
            System.out.println("Сумма меньше 100, оплата прервана");
        }else{
            System.out.println(getName());
        }
    }

    @Override
    public String getName() {
        return "Оплата криптой";
    }
}
