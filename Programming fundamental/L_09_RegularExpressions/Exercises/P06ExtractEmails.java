package L_09_RegularExpressions.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "[A-Za-z0-9]+[._-]?[A-Za-z0-9]+([._-]?[A-Za-z0-9])*@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+";
        Pattern pattern = Pattern.compile(regex);

        String[] emails = input.split("\\s+");

        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);

            if (matcher.find()){
                System.out.println(matcher.group());
            }


        }
    }
}
