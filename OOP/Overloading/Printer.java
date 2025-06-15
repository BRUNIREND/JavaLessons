package OOP.Overloading;

public class Printer {
    public void print(String text){
        System.out.println(text);;
    }
    public void print(int value){
        System.out.println(value);;
    }
    public void print(double valueDouble){
        System.out.println(valueDouble);;
    }

    public void print(String text, int count){
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
}
