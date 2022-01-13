package L_08_TextProcessing.Lab;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuffer digits = new StringBuffer();
        StringBuffer letters = new StringBuffer();
        StringBuffer characters = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (Character.isDigit(symbol)){
                digits.append(symbol);
            }else if (Character.isAlphabetic(symbol)){
                letters.append(symbol);
            }else {
                characters.append(symbol);
            }

        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(characters.toString());
    }
}
