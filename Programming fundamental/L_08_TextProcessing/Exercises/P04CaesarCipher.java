package L_08_TextProcessing.Exercises;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char newSymbol = (char)(text.charAt(i) + 3);
           encryptedText.append(newSymbol);
        }
        System.out.println(encryptedText);
    }
}
