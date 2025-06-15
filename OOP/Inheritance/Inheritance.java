package OOP.Inheritance;

public class Inheritance {

    class Transport {
        public Double speed = 0.0;


        Transport(Double speed){
            this.speed = speed;
        }

        public void move(){
            System.out.println("Скорость: " +  speed);
        }
        
    }

    class Car extends Transport{
        
        String model = "Заглужка";

        Car(String model, Double speed){
            super(speed);
            this.model = model;
        }

        @Override
        public void move() {
            System.out.println("Модель: " + model + "Движется со скоростью: " + speed);
        }
    }
}
