package L02ConditionalStatements.Lab;

import java.util.Scanner;

public class P05PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parola = scanner.nextLine();

        if (parola.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}
