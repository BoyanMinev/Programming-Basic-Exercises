package L_04_Methods.Exercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printAllCharacterBetweenSymbol1AndSymbol2(symbol1, symbol2);
    }

    private static void printAllCharacterBetweenSymbol1AndSymbol2(char symbol1, char symbol2) {
        if (symbol1 < symbol2) {
            for (int i = symbol1 + 1; i < symbol2; i++) {
                System.out.printf("%c ", i);
            }
        } else {
            for (int j = symbol2 + 1; j < symbol1; j++) {
                System.out.printf("%c ", j);
            }
        }
    }
}
