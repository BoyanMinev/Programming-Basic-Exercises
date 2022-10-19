package Lecture_05_FunctionalProgramming.Lab;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class P06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int startRange = Integer.parseInt(input[0]);
        int endRange =  Integer.parseInt(input[1]);

        List<Integer> inputDigits = new ArrayList<>();
        while (startRange <= endRange){

            inputDigits.add(startRange);

            startRange++;
        }
        String command = scanner.nextLine();

        Predicate<Integer> isEven;
        if (command.equals("even")) {
            isEven = integer -> integer % 2 == 0;
        }else {
            isEven = integer -> integer % 2 != 0;
        }

          inputDigits
                  .stream()
                  .filter(isEven)
                  .forEach(digit -> System.out.printf("%d ", digit));


    }
}
