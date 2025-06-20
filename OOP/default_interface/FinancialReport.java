package OOP.default_interface;

import OOP.Interface.Logger;

public class FinancialReport implements Reportable {
    Logger log = new Logger();
    @Override
    public void generateReport(String title) {
        printHeader();
        log.log(title);
        printFooter();
    }
}
