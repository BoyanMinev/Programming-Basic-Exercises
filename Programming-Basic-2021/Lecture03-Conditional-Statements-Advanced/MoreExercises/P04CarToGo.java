package L03ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String typeClass = "";
        String typeCar = "";
        double priceForCar = 0.0;

        if (budget <= 100) {
            typeClass = "Economy class";
            if (season.equalsIgnoreCase("Summer")) {
                typeCar = "Cabrio";
                priceForCar = budget * 0.35;

            } else if (season.equalsIgnoreCase("Winter")) {
                typeCar = "Jeep";
                priceForCar = budget * 0.65;

            }

        } else if (budget > 100 && budget <= 500) {
            typeClass = "Compact class";
            if (season.equalsIgnoreCase("Summer")) {
                typeCar = "Cabrio";
                priceForCar = budget * 0.45;

            } else if (season.equalsIgnoreCase("Winter")) {
                typeCar = "Jeep";
                priceForCar = budget * 0.8;

            }
        } else {
            typeClass = "Luxury class";
            typeCar = "Jeep";
            priceForCar = budget * 0.9;

        }
        System.out.printf("%s%n" +
                "%s - %.2f", typeClass, typeCar, priceForCar);
    }
}
