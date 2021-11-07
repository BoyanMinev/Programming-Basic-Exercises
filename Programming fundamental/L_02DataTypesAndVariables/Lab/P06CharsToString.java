package L_02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            char symbol = input.charAt(0);
            System.out.printf("%c", symbol);
        }
    }
}
