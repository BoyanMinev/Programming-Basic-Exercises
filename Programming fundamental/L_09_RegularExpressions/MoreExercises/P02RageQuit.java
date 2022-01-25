package L_09_RegularExpressions.MoreExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.toUpperCase();
        String regexCountSymbols = "[^\\d]";
        Pattern pattern = Pattern.compile(regexCountSymbols);
        Matcher matcher = pattern.matcher(input);
        StringBuilder symbols = new StringBuilder();
                while (matcher.find()){
                    if (symbols.toString().contains(matcher.group())){
                        continue;
                    }
                    symbols.append(matcher.group());
                }
                int uniqueSymbolsUsed = symbols.length();

            String sequenceSymbolsRegex = "[^\\d]+";
            String numbersRepeatUniqueSymbolsRegex = "[0-9]+";
            Pattern pattern1 = Pattern.compile(sequenceSymbolsRegex);
            Pattern pattern2 = Pattern.compile(numbersRepeatUniqueSymbolsRegex);
            matcher = pattern2.matcher(input);
            List<Integer> numbers = new ArrayList<>();
            while (matcher.find()){

                numbers.add(Integer.parseInt(matcher.group()));
            }


            matcher = pattern1.matcher(input);
            StringBuilder outputText = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            if (matcher.find()){
                for (int j = 0; j < numbers.get(i); j++) {
                    outputText.append(matcher.group());
                }

            }

        }

        System.out.println("Unique symbols used: " + uniqueSymbolsUsed);
        System.out.println(outputText);
    }
}
