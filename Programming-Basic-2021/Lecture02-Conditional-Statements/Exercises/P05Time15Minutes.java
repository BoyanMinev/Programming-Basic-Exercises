package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P05Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());


        int totalMinutes = minutes + (hours * 60);
        int afterMinutes = (totalMinutes + 15) % 60;
        int afterHours = (totalMinutes + 15) / 60;


        if (afterHours == 24) {
            afterHours = 0;

        }if (afterMinutes < 10) {

            System.out.printf("%d:0%d", afterHours, afterMinutes);
        }else if (afterMinutes >= 10){
            System.out.printf("%d:%d", afterHours, afterMinutes);
        }
    }
}
