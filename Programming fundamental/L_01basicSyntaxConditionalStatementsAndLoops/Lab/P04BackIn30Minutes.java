package L_01basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes =Integer.parseInt(scanner.nextLine());

        int allMinutes = (hours * 60) + minutes;
        int inTime30 = allMinutes + 30;
        int currentHours = inTime30 / 60;
        if (currentHours == 24){
            currentHours = 0;
        }
        int currentMinutes = inTime30 % 60;

        System.out.printf("%d:%02d", currentHours, currentMinutes);

}
    }

