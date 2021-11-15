package L_02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class P04DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int i = 0; i < n; i++) {
            char symbol = scanner.next().charAt(0);
            symbol += key;
            output += symbol;
        }
        System.out.println(output);
    }
}
