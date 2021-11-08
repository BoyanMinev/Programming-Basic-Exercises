package L_02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.next().charAt(0);
        char symbol2 = scanner.next().charAt(0);
        char symbol3 = scanner.next().charAt(0);
        System.out.printf("%c %c %c", symbol3, symbol2, symbol1);
    }
}
