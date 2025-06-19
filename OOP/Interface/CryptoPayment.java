package OOP.Interface;

public class CryptoPayment implements PaymentMethod {
    @Override
    public boolean pay(double amount) {
        if (amount <= 100){
            System.out.println("Сумма меньше 100, оплата прервана");
            return false;

        }else{
            return true;
        }
    }

    @Override
    public String getName() {
        return "Оплата криптой";
    }
}
