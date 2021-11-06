package L_02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 British Pound = 1.31 Dollars

        int britishPounds = Integer.parseInt(scanner.nextLine());
        double exchangeCourseToDollars = 1.31;

        double dollars = britishPounds * exchangeCourseToDollars;

        System.out.printf("%.3f", dollars);
    }
}
