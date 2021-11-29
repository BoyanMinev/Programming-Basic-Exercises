package L_04_Methods.Lab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());
        String newSting = repeatString(input, repeat);
        System.out.println(newSting);
    }

    private static String repeatString(String input, int repeat) {
        String newOne  = "";
        for (int i = 0; i < repeat; i++) {
            newOne = newOne + input;
        }
        return newOne;
    }
}
