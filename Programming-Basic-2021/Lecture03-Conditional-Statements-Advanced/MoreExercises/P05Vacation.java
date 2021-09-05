package L03ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String locate = "";
        String placeAccommodation = "";
        double priceForAccommodation = 0.0;

        if (budget <= 1000) {
            placeAccommodation = "Camp";
            if (season.equalsIgnoreCase("Summer")) {
                locate = "Alaska";
                priceForAccommodation = budget * 0.65;

            } else if (season.equalsIgnoreCase("Winter")) {
                locate = "Morocco";
                priceForAccommodation = budget * 0.45;

            }
        } else if (budget > 1000 && budget <= 3000) {
            placeAccommodation = "Hut";
            if (season.equalsIgnoreCase("Summer")) {
                locate = "Alaska";
                priceForAccommodation = budget * 0.8;

            } else if (season.equalsIgnoreCase("Winter")) {
                locate = "Morocco";
                priceForAccommodation = budget * 0.6;

            }
        } else {
            placeAccommodation = "Hotel";
            priceForAccommodation = budget * 0.9;
            if (season.equalsIgnoreCase("Summer")){
                locate = "Alaska";

            }
            else if (season.equalsIgnoreCase("Winter")){
                locate = "Morocco";
            }

        }
        System.out.printf("%s - %s - %.2f", locate, placeAccommodation, priceForAccommodation);
    }
}
