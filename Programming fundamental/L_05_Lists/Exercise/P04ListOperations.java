package L_05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
           String input = scanner.nextLine();
           while (!input.equals("End")){

               String[] command = input.split("\\s+");
               if (command[0].equals("Add")){
                   numbers.add(Integer.parseInt(command[1]));
               }else if (command[0].equals("Insert")){
                   if (checkIndex(Integer.parseInt(command[2]), numbers)) {
                       numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                   }else {
                       System.out.println("Invalid index");
                   }
               }else if (command[0].equals("Remove")){

                   if (checkIndex(Integer.parseInt(command[1]), numbers)){
                       numbers.remove(Integer.parseInt(command[1]));
                   }else {
                       System.out.println("Invalid index");
                   }
               }else if (command[0].equals("Shift")){
                   if (command[1].equals("left")){
                       shiftLeft(numbers, Integer.parseInt(command[2]));
                   }else if (command[1].equals("right")){
                      shiftRight(numbers, Integer.parseInt(command[2]));
                   }
               }
               input = scanner.nextLine();
           }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));

    }

    private static boolean checkIndex(int index, List<Integer> numbers) {

        return index < numbers.size() && index >= 0;
    }

    private static void shiftLeft(List<Integer> numbers, int countIndex) {
        for (int i = 0; i < countIndex; i++) {
            numbers.add(numbers.get(0));
            numbers.remove(0);
        }
    }

    private static void shiftRight(List<Integer> numbers, int countIndex) {
        for (int i = 0; i < countIndex; i++) {
            numbers.add(0,numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }
    }
}
