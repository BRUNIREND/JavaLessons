import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MultiPhoneBook {
    TreeMap<String, ArrayList<String>> phoneBook = new TreeMap<>();

    public void add(String name, String phone){
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(phone);
        }else{
            ArrayList<String> semList = new ArrayList<>();
            semList.add(phone);
            phoneBook.put(name, semList);
        }
    }
    public void printAll(){
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }

    public void find (String name){
        if(phoneBook.containsKey(name)){
            System.out.println( "Имя: " + name + " Телефон: " + phoneBook.get(name));
        }else{
            System.out.println("Такого имени не найдено!");
        }
    }
}
