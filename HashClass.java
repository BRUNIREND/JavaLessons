// import java.util.HashSet;
// import java.util.Random;
// import java.util.Scanner;

// public class HashClass {
    
    
//     public static void main(String[] args){
//         HashSet<Integer> randomValuesHashSet = new HashSet<>();
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();

//         for (int i = 0; i < 10; i++){
//             randomValuesHashSet.add(random.nextInt(100));
//         }
//         if (randomValuesHashSet.isEmpty() != true){
//             for (Integer integer : randomValuesHashSet) {
//                 System.out.println("Значение из списка: " + integer);
//             }
//         }
//         System.out.println("Введите число для удаление из коллекции: ");
//         Integer userInput = scanner.nextInt();
//         if (!userInput.toString().equals("") ){
//             System.out.println("Вы удалили число: " + userInput);
//             randomValuesHashSet.remove(userInput);
//         }
//     }
// }
