package Lecture_05_FunctionalProgramming.Lab;



import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Consumer<String> print = result -> System.out.println(result);

        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> inputDigits = Arrays.stream(input.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = inputDigits
                .stream()
                .filter(isEven)
                .collect(Collectors.toList());

        String firstOutput = evenNumbers
                .stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(", "));

        print.accept(firstOutput);

        String secondOutput = evenNumbers
                .stream()
                .sorted()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(", "));

        print.accept(secondOutput);



        









    }

}
