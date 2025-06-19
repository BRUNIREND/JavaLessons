package OOP.Interface;

public class CreditCardPayment implements PaymentMethod, Refundable{
    @Override
    public boolean pay(double amount) {

        if (amount <= 10000){
            return true;
        }else{
            System.out.println("Сумма оплаты превышает 10000");
            refund(amount);
            return false;
        }
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возвращение суммы: " + amount);
    }

    @Override
    public String getName() {
        return "Оплата кредитной картой";
    }
}
