package OOP.Interface;

import java.util.ArrayList;

public class PaymentProcessor {

    Logger logger = new Logger();
    public void processPayment(ArrayList<PaymentMethod> methods, double amount){
        for (PaymentMethod paymentMethod : methods) {
            logger.log(paymentMethod.getName());

            if(paymentMethod.pay(amount)){
                logger.success(paymentMethod.getName());
            }else{
               logger.error(paymentMethod.getName() + " " + "ошибка в текущем способе оплаты"); 
            }

        }
    }
}
