package L_02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P09CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        //•	Assume that a year has 365.2422 days at average.
        double averageDaysInYear = 365.2422;
        double years = centuries * 100;
        double days = years * averageDaysInYear;
        double hours = days * 24;
        double minutes = hours * 60;
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",
                centuries, years, days, hours, minutes);
    }
}
