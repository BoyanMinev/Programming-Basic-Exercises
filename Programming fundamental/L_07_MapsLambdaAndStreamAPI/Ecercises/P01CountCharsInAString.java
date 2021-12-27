package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> countCharacter = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' '){
                continue;
            }else {
                if (!countCharacter.containsKey(text.charAt(i))){
                    countCharacter.put(text.charAt(i), 1);
                }else {
                    countCharacter.put(text.charAt(i), countCharacter.get(text.charAt(i)) + 1);
                }
            }
        }
       countCharacter.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
