package L_01basicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String password = "";
        int counterTries = 0;

        for (int i = user.length() -1 ; i >=0; i--) {

            char symbol = user.charAt(i);

            password += symbol;


        }
        String input = scanner.nextLine();
        while (!input.equals(password)){

            counterTries++;
            if (counterTries == 4){
                System.out.printf("User %s blocked!", user);
                return;
            }
            System.out.println("Incorrect password. Try again.");

            input = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", user);
    }
}
