package L_01basicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String reverseInput = "";

        for (int i = input.length() - 1 ; i >= 0; i--) {
            char symbol =input.charAt(i);
            reverseInput += symbol;
        }
        System.out.println(reverseInput);
    }
}
