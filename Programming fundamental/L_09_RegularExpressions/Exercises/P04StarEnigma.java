package L_09_RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanet = new ArrayList<>();
        List<String> destroyedPlanet = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String encrypted = scanner.nextLine();
            int count = countLetters(encrypted);
            String decrypted = decrypting(encrypted, count);

            String regex = "[^@!\\-:]*?@(?<planetName>[A-Z][a-z]+)[^@!\\-:]*?:(?<population>\\d+)[^@!\\-:]*?!(?<attackType>[AD])![^@!\\-:]*?->(?<soldierCount>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decrypted);
            if (matcher.find()){
                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));
                if (attackType.equals("A")){
                    attackedPlanet.add(planetName);
                }else if (attackType.equals("D")){
                    destroyedPlanet.add(planetName);
                }

            }
        }
        System.out.println("Attacked planets: " + attackedPlanet.size());
        Collections.sort(attackedPlanet);
        attackedPlanet.forEach(entry-> System.out.println("-> " + entry));
        System.out.println("Destroyed planets: " + destroyedPlanet.size());
        Collections.sort(destroyedPlanet);
        destroyedPlanet.forEach(entry -> System.out.println("-> " + entry));
    }

    private static String decrypting(String encrypted, int count) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encrypted.length(); i++) {
            char symbol = (char)(encrypted.charAt(i) - count);

            decryptedText.append(symbol);

        }

        return decryptedText.toString();



    }

    private static int countLetters(String input) {
        String inputToLowerCase = input.toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char symbol = inputToLowerCase.charAt(i);
            switch (symbol){
                case 's':
                case 't':
                case 'a':
                case 'r':
                    count++;
                break;
            }
        }
        return count;



    }
}
