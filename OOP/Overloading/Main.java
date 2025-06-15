package OOP.Overloading;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        printer.print("Привет");
        printer.print(5);
        printer.print("Hello", 3);
    }
}
