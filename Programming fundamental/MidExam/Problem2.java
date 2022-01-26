package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                        .collect(Collectors.toList());
           String input = scanner.nextLine();
           while(!input.equals("Finish")){

               String[] command = input.split(" ");
               if (command[0].equals("Add")){
                   commandAdd(command, numbers);
               }else if (command[0].equals("Remove")){
                   commandRemove(command, numbers);
               }else if (command[0].equals("Replace")){
                   commandReplace(command, numbers);
               }else if(command[0].equals("Collapse")){
                   commandCollapse(command, numbers);
               }


               input = scanner.nextLine();
           }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }

    private static void commandCollapse(String[] command, List<Integer> numbers) {
        int value = Integer.parseInt(command[1]);

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < value){
                numbers.remove(i);
                i = -1;
            }
        }
    }

    private static void commandReplace(String[] command, List<Integer> numbers) {
        int value = Integer.parseInt(command[1]);
        int replacementValue = Integer.parseInt(command[2]);
        for (int i = 0; i <numbers.size(); i++) {
            if (numbers.get(i) == value){
                numbers.set(i, replacementValue);
                break;
            }
        }
    }

    private static void commandRemove(String[] command, List<Integer> numbers) {
        int value = Integer.parseInt(command[1]);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == value){
                numbers.remove(i);
                break;
            }
        }
    }

    private static void commandAdd(String[] command, List<Integer> numbers) {
        int value = Integer.parseInt(command[1]);
        numbers.add(value);
    }
}
