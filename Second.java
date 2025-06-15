import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class Second {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Hello world");
        // ScanAge();
        // PrintNumbers();
        // PrintNames(names);
        // System.out.println("Среднее значение: " + startAverage(scanner));
        
        // Third lesson
        Person student1 = new Person("Алёна", 5.0, 18);
        Person student2 = new Person("Изольда", 4.0, 17);
        Person student3 = new Person("Вампир", 1.0, 16);
        Person student4 = new Person("Анатолий", 3.0, 19);
        Person student5 = new Person("Валерий", 5.0, 20);


        // student1.printInfo();
        // student2.printInfo();
        // student3.printInfo();
        
        Person[] students = {student1, student2, student3, student4, student5};

        // for (int i = 0; i < students.length; i++){
        //     if (students[i].isAdult()){
        //         students[i].printInfo();
        //     }
        // }
        // printExcellentStudents(students);
        // printAverageGrade(students);

        int userInput = -1;

        var studentManager = new StudentManager();

        while (userInput != 0){
            System.out.println("Выберите действие.");
            System.out.println("0.Выйти\n1. Добавить студента\n2. Вывести всех студентов\n3. Найти студента\n4. Вывести успешных студентов\n5. Отсоритровать студентов");
            
            userInput = scanner.nextInt();
            scanner.next();
            switch (userInput) {
                case 1:
                    System.out.println("Введите имя: ");
                    final String nameString = scanner.nextLine();
                    scanner.next();
                    System.out.println("Введите возраст: ");
                    final int ageString = scanner.nextInt();

                    System.out.println("Введите оценку: ");
                    final Double gradeString = scanner.nextDouble();
                    
                    studentManager.addStudent(nameString, ageString, gradeString);
                    break;
                case 2:
                    
                    studentManager.listStudent();
                    break;
                case 3:
                    System.out.println("Введите имя: ");
                    final String nameForFindString = scanner.nextLine();

                    studentManager.findStudentByName(nameForFindString);
                    break;

                case 4:
                    studentManager.listExcellentAndGood();
                    break;
                case 5:
                    studentManager.sortByGradeDesc();
                    break;
                default:
                    break;
            }

        }
        
    }

    static void printExcellentStudents(Person[] students){
        System.out.println("Отличники:");
        for (Person person : students) {
            if (person.getGradeLevel() == "Отличник"){
                
                person.printInfo();
            }
        }
    }

    static void printAverageGrade(Person[] students){
        double averageStudentsScore = 0;

        for (Person person : students) {
            averageStudentsScore += person.grade;
        }
        averageStudentsScore = averageStudentsScore / students.length;
        System.out.println("Средняя оценка студентов: " + averageStudentsScore);
    }

    static String[] names = {"Иван", "Егор", "Артем", "Ярослав"};

    // First lesson
    static void PrintNames(String[] namesForPrints){
        for (int i = 0; i <= namesForPrints.length; i++){
            System.out.println("Привет, " + namesForPrints[i] + "!");
        }
    }


    //Second lesson
    static Double startAverage(Scanner scanner){

        System.out.println("Введите размерность массива: ");
        Integer[] startArray = new Integer[scanner.nextInt()];
        
        for (int i = 0; i < startArray.length; i++) {
            System.out.println("Введите число: ");
            startArray[i] = scanner.nextInt();
        }
        
        return Average(startArray);
    }
    static Double Average(Integer[] arrayDoubles){
        double value = 0;

        for (int i = 0; i <  arrayDoubles.length; i++){
            value += arrayDoubles[i];
        }

        return value / arrayDoubles.length;
    }

    
}

class StudentManager{
    ArrayList<Person> students = new ArrayList<>();

    void addStudent(String name, int age, Double grade){
        
        students.add(new Person(name, grade, age));
    }

    void listStudent(){
        if (students.isEmpty()){
            System.out.println("Список студентов пуст.");
        }else{
            for (Person person : students) {
                person.printInfo();
            }
        }
        
    }

    void findStudentByName(String name){
        for (Person person : students) {
            if (person.name.equals(name)){
                person.printInfo();
            }
        }
    }
    void listExcellentAndGood(){
        for (Person person : students) {
            if (person.grade >= 3.0){
                person.printInfo();
            }
        }
    }
    void sortByGradeDesc(){
        students.sort(new Comparator<Person>() {
            public int compare(Person p1, Person p2){
                return Double.compare(p2.grade, p1.grade);
            }
        });

        for (Person person : students) {
            person.printInfo();
        }
    }
}

class Person {
    String name;
    Double grade;
    int age;


    public Person(String name, Double grade, int age){
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    boolean isAdult(){
        return this.age >= 18; 
    }

    String getGradeLevel(){
        if (this.grade >= 4.5){
            return "Отличник";
        }else if (this.grade >= 3.0) {
            return "Хорошист";
        }else{
            return "Двоечник";
        }
    }
    void printInfo(){
        System.out.println("Имя студента: " + this.name);
        System.out.println("Оценка студента: " + this.grade);
        System.out.println("Ты " + getGradeLevel());
    }
}