package L_09_RegularExpressions.MoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        String firstPart = input[0];

        String regexFirstPart = "([#$\\*&])(?<capitalLetters>[A-Z]+)\\1";
        Pattern patternCapital = Pattern.compile(regexFirstPart);
        Matcher matcher = patternCapital.matcher(firstPart);
        String capitalLetters = "";

        if (matcher.find()) {
            capitalLetters = matcher.group("capitalLetters");
        }


        String secondPart = input[1];

        String regexSecondPart = "(?<capitalLetterCharacter>\\d{1,3}):(?<wordLength>\\d{2})";
        Pattern patternWordLength = Pattern.compile(regexSecondPart);
        String[] thirdPart = input[2].split("\\s+");
        matcher = patternWordLength.matcher(secondPart);
        Map<String, Integer> wordLength = new LinkedHashMap<>();
        while (matcher.find()){

            wordLength.put(matcher.group("capitalLetterCharacter"), Integer.parseInt(matcher.group("wordLength")) + 1);


        }

        for (int i = 0; i < capitalLetters.length(); i++) {
            String finalCapitalLetters = capitalLetters;
            int index = i;
            wordLength.forEach((key, value) -> {
                if (finalCapitalLetters.charAt(index) == (char)Integer.parseInt(key)) {
                    for (int j = 0; j < thirdPart.length; j++) {
                        if (thirdPart[j].charAt(0) == (char)Integer.parseInt(key)) {
                            if (thirdPart[j].length() == value) {
                                System.out.println(thirdPart[j]);
                            }
                        }
                    }
                }


            });


        }

    }


}














