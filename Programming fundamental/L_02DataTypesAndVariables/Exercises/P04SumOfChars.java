package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumCharacters = 0;
        for (int i = 0; i < n; i++) {
            char symbol = scanner.next().charAt(0);
            sumCharacters += symbol;

        }
        System.out.printf("The sum equals: %d", sumCharacters);

    }
}
