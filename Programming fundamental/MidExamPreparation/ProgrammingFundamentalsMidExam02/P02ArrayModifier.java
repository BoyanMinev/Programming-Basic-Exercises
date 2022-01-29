package MidExamPreparation.ProgrammingFundamentalsMidExam02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] command = input.split(" ");
            if (command[0].equals("swap")) {
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);
                commandSwap(index1, index2, numbers);
            } else if (command[0].equals("multiply")) {
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);
                commandMultiply(index1, index2, numbers);
            }else if (command[0].equals("decrease")){
                commandDecrease(numbers);
            }
            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("\\[\\],", ", ").replaceAll("[\\[\\],]", "").replaceAll(" ", ", "));


    }

    private static void commandDecrease(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {

                numbers.set(i, numbers.get(i) - 1);

        }
    }

    private static void commandMultiply(int index1, int index2, List<Integer> numbers) {
        int num1 = numbers.get(index1);
        int num2 = numbers.get(index2);
        numbers.set(index1, num1 * num2);

    }

    private static void commandSwap(int index1, int index2, List<Integer> numbers) {
        int swapElement = numbers.get(index1);
        int swapElement2 = numbers.get(index2);
        numbers.set(index1, swapElement2);
        numbers.set(index2, swapElement);

    }
}
