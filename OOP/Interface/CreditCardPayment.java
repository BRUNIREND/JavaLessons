package OOP.Interface;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {

        if (amount >= 10000){
            System.out.println("Сумма оплаты превышает 10000");
            System.out.println(getName());
        }else{
            System.out.println(getName());
        }
    }

    @Override
    public String getName() {
        return "Оплата кредитной картой";
    }
}
