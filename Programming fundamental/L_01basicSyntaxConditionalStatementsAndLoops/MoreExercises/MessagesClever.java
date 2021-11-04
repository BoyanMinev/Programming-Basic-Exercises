package L_01basicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class MessagesClever {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        int mainDigit = 0;
        for (int i = 0; i < counter; i++) {
            String number = scanner.nextLine();
            int num = Integer.parseInt(number);

            int numberOfDigit = number.length();
            if (num < 22) {
                 mainDigit = num;
            }else {
                mainDigit = num % 10;
            }
            int offset = (mainDigit - 2) * 3;
            if(mainDigit == 9 || mainDigit == 7 || mainDigit == 8){
                offset++;
            }
            int letterIndex = offset + number.length() - 1;
            System.out.printf("%c", letterIndex + 97);
        }

    }
}
