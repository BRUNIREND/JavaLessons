package OOP.Overriding;

public class Main {
    public static void main(String[] args){
        // Shape[] shapes = {new Circle(), new Square(), new Triangle()};

        // for (Shape shape : shapes) {
        //     shape.draw();
        // }

        Notification[] notifications = {new EmailNotification(), new SMSNotification(), new PushNotification()};

        for (Notification notification : notifications) {
            notification.send();;
        }
    }
}   
