import java.util.ArrayList;
import java.util.Comparator;

public class Persons {
    ArrayList<String> personsList = new ArrayList<>();

    public void addPerson(String name){
        personsList.add(name);
    }

    public boolean ifContainVasiliy(){
        if (personsList.contains("Василий")){
            return true;
        }
        return false;
    }
    
}
