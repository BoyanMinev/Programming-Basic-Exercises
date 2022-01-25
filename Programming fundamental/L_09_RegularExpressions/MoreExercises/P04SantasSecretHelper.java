package L_09_RegularExpressions.MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctionIndex = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        StringBuilder decodingText = new StringBuilder();
        while (!input.equals("end")) {
            for (int i = 0; i < input.length(); i++) {
                decodingText.append((char) (input.charAt(i) - correctionIndex));
            }
            String regex = "@(?<childName>[A-Za-z]+)[^@!:>-]+!(?<behaviourType>[GN])!";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(decodingText);
            if (matcher.find()) {
                String childName = matcher.group("childName");
                String behaviourType = matcher.group("behaviourType");

                if (behaviourType.equals("G")){

                    System.out.println(childName);
                }


            }
           decodingText = new StringBuilder();
            input = scanner.nextLine();
        }

    }
}
