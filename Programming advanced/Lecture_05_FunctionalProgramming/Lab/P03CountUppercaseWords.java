package Lecture_05_FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split("\\s+");
        Predicate<String> isStartWithUpLatter = word -> word.charAt(0)>= 65 && word.charAt(0)<= 90;


       List<String> wordsWithUpperCase = Arrays.stream(input).filter(isStartWithUpLatter).collect(Collectors.toList());

        System.out.println(wordsWithUpperCase.size());
        wordsWithUpperCase.stream().forEach(System.out::println);


    }
}
