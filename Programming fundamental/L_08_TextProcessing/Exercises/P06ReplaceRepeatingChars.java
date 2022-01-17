package L_08_TextProcessing.Exercises;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        for (int i = 0; i < text.length() - 1; i++) {

           if (text.charAt(i) == text.charAt(i + 1)){
               text.deleteCharAt(i);
               i --;
           }
        }
        System.out.println(text);
    }
}
