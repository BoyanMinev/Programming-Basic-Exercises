package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P09Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double gamesInSofia = 1.0 * ((48 - h) * 3) / 4;
        //gamesInHomeTown = h
        double gamesInHoliday = 1.0 * (p * 2) / 3;
        double totalGamesOfYear = 0.0;
        if (typeOfYear.equalsIgnoreCase("leap")) {
            totalGamesOfYear = Math.floor((gamesInSofia + h + gamesInHoliday) +
                    ((gamesInSofia + h + gamesInHoliday) * 0.15));

        }else if (typeOfYear.equalsIgnoreCase("normal")){

            totalGamesOfYear = Math.floor(
                    gamesInSofia + h + gamesInHoliday);
        }
        System.out.printf("%.0f", totalGamesOfYear);
    }
}
