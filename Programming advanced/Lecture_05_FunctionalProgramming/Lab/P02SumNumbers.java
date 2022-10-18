package Lecture_05_FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P02SumNumbers {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();



        Function<String, Integer> countDigits = e ->  Arrays.stream(e.split(", ")).mapToInt(Integer::parseInt).toArray().length;
        Function<String, Integer> sumDigits = e -> Arrays.stream(Arrays.stream(e.split(", ")).mapToInt(Integer::parseInt).toArray()).sum();



        System.out.printf("Count = %d%n" +
                "Sum = %d", countDigits.apply(input), sumDigits.apply(input));






    }


}
