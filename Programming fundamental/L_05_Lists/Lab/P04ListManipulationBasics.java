package L_05_Lists.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        String command = scanner.nextLine();

           while (!command.equals("end")){
              List<String> commands = Arrays.stream(command.split(" "))
                              .collect(Collectors.toList());
                 if (commands.get(0).equals("Add")){
                     addToListNumbers(commands, numbers);
                 }else if (commands.get(0).equals("Remove")){
                     removeFromListNumbers(commands, numbers);
                 }else if (commands.get(0).equals("RemoveAt")){
                     removeIndexFromListNumbers(commands, numbers);
                 }else if (commands.get(0).equals("Insert")){
                     insertToListNumbers(commands, numbers);
                 }

               command = scanner.nextLine();
           }
        for (int output:
             numbers) {
            System.out.print(output + " ");
        }
    }

    private static void addToListNumbers(List<String> commands, List<Integer> numbers) {

        int addNumber = Integer.parseInt(commands.get(1));

        numbers.add(addNumber);

    }

    private static void removeFromListNumbers(List<String> commands, List<Integer> numbers) {

        int removeIndex = Integer.parseInt(commands.get(1));
        numbers.remove(Integer.valueOf(removeIndex));

    }

    private static void removeIndexFromListNumbers(List<String> commands, List<Integer> numbers) {
        int removeIndex = Integer.parseInt(commands.get(1));
        numbers.remove(removeIndex);
    }

    private static void insertToListNumbers(List<String> commands, List<Integer> numbers) {
        int numberInsert = Integer.parseInt(commands.get(1));
        int numberIndex = Integer.parseInt(commands.get(2));
        numbers.add(numberIndex, numberInsert);
    }
}
