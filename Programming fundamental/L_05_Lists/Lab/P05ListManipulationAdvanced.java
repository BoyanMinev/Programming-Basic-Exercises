package L_05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<String> command = Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());

        while (!command.get(0).equals("end")){

            if (command.get(0).equals("Contains")){
                checkListForContainNumber(command, numbers);
            }else if (command.get(0).equals("Print")){
                if (command.get(1).equals("even")){
                    printAllEvenNumbersFromList(numbers);
                }else if (command.get(1).equals("odd")){
                    printAllOddNumbersFromList(numbers);
                }
            }else if (command.get(0).equals("Get")){
                if (command.get(1).equals("sum")){
                    printSumOfAllNumbersFromList(numbers);
                }
            }else if (command.get(0).equals("Filter")){
                filterAndPrintNumbersFromList(numbers, command);
            }

            command = Arrays.stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
        }
    }


    private static void checkListForContainNumber(List<String> command, List<Integer> numbers) {
        int numberForCheck = Integer.parseInt(command.get(1));


        if (numbers.contains(numberForCheck)){
            System.out.println("Yes");
        }else {
            System.out.println("No such number");
        }
    }

    private static void printAllEvenNumbersFromList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0){
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printAllOddNumbersFromList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0){
                System.out.print(numbers.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printSumOfAllNumbersFromList(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }

    private static void filterAndPrintNumbersFromList(List<Integer> numbers, List<String> command) {
        String condition = command.get(1);
        int number = Integer.parseInt(command.get(2));


        switch (condition){
            case "<":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) < number){
                        System.out.print(numbers.get(i) + " ");

                    }
                }
                System.out.println();
                break;
            case ">":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) > number){
                        System.out.print(numbers.get(i) + " ");

                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) >= number){
                        System.out.print(numbers.get(i) + " ");

                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <= number){
                        System.out.print(numbers.get(i) + " ");

                    }
                }
                System.out.println();
                break;
        }

    }
}
