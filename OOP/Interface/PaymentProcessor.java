package OOP.Interface;

import java.util.ArrayList;

public class PaymentProcessor {
    public void processPayment(ArrayList<PaymentMethod> methods, double amount){
        for (PaymentMethod paymentMethod : methods) {
            paymentMethod.pay(amount);
        }
    }
}
