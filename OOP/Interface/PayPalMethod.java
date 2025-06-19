package OOP.Interface;

public class PayPalMethod implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return "Оплата через PayPal";
    }
}
