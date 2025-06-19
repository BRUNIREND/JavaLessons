package OOP.Abstraction;

public abstract class Vehicle {
    public  double speed;

    public abstract void move();

    public void info(){
        System.out.println("Скорость: " + speed);
    }

}
