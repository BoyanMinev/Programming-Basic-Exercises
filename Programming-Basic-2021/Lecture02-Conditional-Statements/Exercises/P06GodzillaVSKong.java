package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P06GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothePrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double totalClothesPrice = clothePrice * people;

        String output = "";

        if (people > 150) {
            totalClothesPrice *= 0.90;
        }
        double expenses = decor + totalClothesPrice;

        if (expenses > budget) {
            output = String.format("Not enough money! %n" +
                    "Wingard needs %.2f leva more.", expenses - budget);

        } else
            output = String.format("Action!%n" +
                    "Wingard starts filming with %.2f leva left.", budget - expenses);
        //Print
        System.out.println(output);

    }
}
