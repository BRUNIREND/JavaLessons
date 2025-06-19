package OOP.Abstraction;

public class Main {
    public static void main(String[] args){
        Vehicle[] vehicles = {new Bycycle(), new Car()};

        for (Vehicle vehicle : vehicles) {
            vehicle.speed = 40;
            vehicle.move();
            vehicle.info();
        }
    }
}
