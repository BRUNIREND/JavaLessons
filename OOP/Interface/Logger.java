package OOP.Interface;

import java.util.Calendar;
import java.util.GregorianCalendar;

interface ILogger {
    public void log(String message);
    public void success(String message);
    public void error(String message);
    
}

public class Logger implements ILogger {
    @Override
    public void log(String message) {
        Calendar newDate = new GregorianCalendar(); 
        System.out.println("[LOG " + newDate.get(Calendar.HOUR) + ":" + newDate.get(Calendar.MINUTE) + ":" + newDate.get(Calendar.SECOND) +"]"+ " " + message);
    }

    @Override
    public void success(String message) {
        System.out.println("[SUCCESS]" + " " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("[ERROR]" + " " + message);
    }
}
