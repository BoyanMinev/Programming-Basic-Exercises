package Lecture_05_FunctionalProgramming.Lab;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfLines = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> people = new LinkedHashMap<>();

        while (numberOfLines > 0){
            List<String> lineData = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
            people.put(lineData.get(0), Integer.parseInt(lineData.get(1)));

            numberOfLines--;
        }
        String conditionIn = scanner.nextLine();
        int filterAge = Integer.parseInt(scanner.nextLine());

        Predicate<String> conditionYounger = condition -> condition.equals("younger");

        String format = scanner.nextLine();

        if (conditionIn.equals("younger")) {
            people.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() <= filterAge).forEach(e ->
            {
                if (format.equals("name age")) {
                    System.out.printf("%s - %d%n", e.getKey(), e.getValue());
                } else if (format.equals("name")) {
                    System.out.printf("%s%n", e.getKey());
                }else {
                    System.out.printf("%d%n",e.getValue());
                }

        });
        }
        else {
            people.entrySet().stream().filter(stringIntegerEntry -> stringIntegerEntry.getValue() >= filterAge).forEach(e -> {
                if (format.equals("name age")) {
                    System.out.printf("%s - %d%n", e.getKey(), e.getValue());
                } else if (format.equals("name")) {
                    System.out.printf("%s%n", e.getKey());
                }else {
                    System.out.printf("%d%n",e.getValue());
                }
            });
        }
    }
}
