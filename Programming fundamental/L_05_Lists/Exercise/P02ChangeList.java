package L_05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
           String input = scanner.nextLine();

           while(!input.equals("end")){
               String[] command = input.split(" ");

               if (command[0].equals("Delete")){
                   int element = Integer.parseInt(command[1]);
                   deleteElements(numbers, element);
               }else if (command[0].equals("Insert")){
                   int element = Integer.parseInt(command[1]);
                   int index = Integer.parseInt(command[2]);
                   insertElements(numbers, element, index);
               }
               input = scanner.nextLine();
           }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }

    private static void deleteElements(List<Integer> numbers, int element) {

            numbers.removeAll(Arrays.asList(element));

    }

    private static void insertElements(List<Integer> numbers, int element, int index) {

        numbers.add(index, element);
    }
}
