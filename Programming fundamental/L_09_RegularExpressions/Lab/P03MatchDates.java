package L_09_RegularExpressions.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\d{2}(?<separator>[-./])[A-Z][a-z]{2}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String separator = "" + matcher.group().charAt(2);
            String day = "";
            String month = "";
            String year = "";
            String[] data = new String[0];
            switch (separator){
                case "/":
                    data = matcher.group().split("/");
                    break;
                case "-":
                    data = matcher.group().split("-");
                    break;
                case ".":
                    data = matcher.group().split("\\.");
                    break;
            }
            day =data[0];
            month = data[1];
            year = data[2];

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
