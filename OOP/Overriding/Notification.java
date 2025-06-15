package OOP.Overriding;

public abstract class Notification {
    public abstract void send();
}

class EmailNotification extends Notification{
    @Override
    public void send(){
        System.out.println("Отправка Email");
    }
}

class SMSNotification extends Notification{
    @Override
    public void send(){
        System.out.println("Отправка SMS");
    }
}

class PushNotification extends Notification{
    @Override
    public void send(){
        System.out.println("Отправка Push");
    }
}
