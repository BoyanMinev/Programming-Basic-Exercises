package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startCharacter = Integer.parseInt(scanner.nextLine());
        int lastCharacter = Integer.parseInt(scanner.nextLine());

        for (int i = startCharacter; i <= lastCharacter; i++) {

            System.out.printf("%c ", i);

        }
    }
}
