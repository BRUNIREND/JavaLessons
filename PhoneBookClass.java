import java.util.HashMap;

public class PhoneBookClass {
    HashMap<String, String> phoneBookMap = new HashMap<>();


    void putInPhoneBook(String userInput){

        phoneBookMap.put(userInput.split(" ")[0], userInput.split(" ")[1]);
    }

    void printValuesOnScreen(){
        for (String key : phoneBookMap.keySet()) {
            System.out.println("Имя: "+ key + " " + "Телефон: " + phoneBookMap.get(key));
        }
    }
    public String searchIntoPhoneBook(String name){
        if (phoneBookMap.containsKey(name)){
            return phoneBookMap.get(name);
        }else{
            return "Имя не найдено";
        }
    }

}
