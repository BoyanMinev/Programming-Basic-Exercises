package L_04_Methods.Exercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacters(input);
    }

    private static void printMiddleCharacters(String input) {
        String middleCharacters = "";


        if (input.length() % 2 == 0) {
            for (int i = input.length() / 2; i <= (input.length() / 2) + 1; i++) {
                middleCharacters = middleCharacters + input.charAt(i - 1);
            }
        } else {
            middleCharacters += input.charAt(((input.length() + 1) / 2) - 1);
        }
        System.out.println(middleCharacters);
    }
}

