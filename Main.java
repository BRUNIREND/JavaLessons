import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    // int age = 25;
    // double price = 19.99;
    // boolean isOnline = true;
    // char grade = 'A';
    // String name = "Андрей";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        MultiPhoneBook phoneBook = new MultiPhoneBook();

        for (int i = 0; i < 2; i++) {
            System.out.println("Введите имя: ");
            String[] userInput = scanner.nextLine().split(" ");
            String name = userInput[0];
            String phone = userInput[1];
            phoneBook.add(name, phone);
        }
        phoneBook.printAll();
        phoneBook.find("Yaroslav");
        // Persons persons = new Persons(); 
        // for (int i = 0; i < 5; i++){
        //     System.out.println("Введите имя: ");
            // persons.addPerson(scanner.nextLine());
        // }
        // if (persons.personsList != null){
        //     persons.personsList.sort(Comparator.reverseOrder());
        // }
        // for (String person  : persons.personsList) {
        //     System.out.println(person);
        // }
        // if (persons.ifContainVasiliy()){
        //     System.out.println("Тут есть Василий");
        // }
        // System.out.println("Hello world");
        // ScanAge();
        // PrintNumbers();
        // System.out.println("Результат вычислений:" + Double.toString(Calculaters()));
        // Transport[] transports = {new Car(), new Bicycle(), new Train()};

        // for (Transport transport : transports) {
        //     transport.move();
        // }

        
        

    }

    static double Calculaters(){
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        
        System.err.println("Введите число 1: ");
        double userInputValue1 = scanner.nextInt();
        scanner.nextLine();
        System.err.println("Введите знак операции:");
        String userInputValString = scanner.nextLine();
        
        System.err.println("Введите число 2: ");
        double userInputValue2 = scanner.nextInt();

        switch (userInputValString) {
            case "+":
                result = userInputValue1 + userInputValue2;
                return result;
            case "-":
                result = userInputValue1 - userInputValue2;
                return result;
            case "*":
                result = userInputValue1 * userInputValue2;
                return result;
            case "/":
                result = userInputValue1 / userInputValue2;
                return result;
            default:
                break;
        }
        return result;
    }
    static void PrintNumbers(){
        for (int i = 0; i < 20; i+=2){
            System.out.println(i);
        }
    }
    static void ScanAge(){
        Scanner scanner = new Scanner(System.in);
        String userInputName = "";
        int userInputAge = 0;
        System.out.println("Введите имя: ");
        userInputName = scanner.nextLine();
        System.out.println("Введите возраст: ");
        userInputAge = scanner.nextInt();
        System.out.println("Приветствую," + userInputName + "!");
        if (userInputAge >= 18){
            System.out.println("Доступ разрешен.");

        }else{
            System.out.println("Доступ запрещен!");
        }
    }


}