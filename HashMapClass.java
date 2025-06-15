import java.util.Scanner;

public class HashMapClass {
    public static void main(String[] args){
        PhoneBookClass phoneBook = new PhoneBookClass();
        final Scanner scanner = new Scanner(System.in);
        String userInput = "";
        String name = "";
        String phone = "";
        for (int i = 0; i < 5; i++){
            System.out.println("Введите данные абонента в формате Имя Телефон: ");
            userInput = scanner.nextLine();
            phoneBook.putInPhoneBook(userInput);
        }
        phoneBook.printValuesOnScreen();

        System.out.println("Введите имя абонента: ");
        userInput = scanner.nextLine();

        System.out.println(phoneBook.searchIntoPhoneBook(userInput));
    }
}
