package OOP.Interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        
        PaymentProcessor processor = new PaymentProcessor();
        ArrayList<PaymentMethod> paymentMethod = new ArrayList<>();
        paymentMethod.add(new PayPalMethod());
        paymentMethod.add(new CryptoPayment());
        paymentMethod.add(new CreditCardPayment());

        processor.processPayment(paymentMethod, 100);
    }
}
