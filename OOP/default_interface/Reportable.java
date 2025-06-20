package OOP.default_interface;

public interface Reportable {
    void generateReport(String title);

    default void printHeader(){
        System.out.println("==== Начало отчета ====");
    }

    default void printFooter(){
        System.out.println("==== Конец отчета ====");
    }
}
