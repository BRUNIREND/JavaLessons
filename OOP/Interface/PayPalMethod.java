package OOP.Interface;

public class PayPalMethod implements PaymentMethod, Refundable {

    @Override
    public boolean pay(double amount) {
        System.out.println(getName());
        return true;
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возвращение суммы: " + amount);
    }
    @Override
    public String getName() {
        return "Оплата через PayPal";
    }
}
