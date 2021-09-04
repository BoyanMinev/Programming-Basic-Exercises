package L03ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numChrysanthemums = Integer.parseInt(scanner.nextLine());
        int numRoses = Integer.parseInt(scanner.nextLine());
        int numTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String yesOrNoHoliday = scanner.nextLine();

        double totalPriceFlowers = 0.0;

        double totaPriceFlowersdiscount = 0.0;
        double priceChrysanthemums = 0.0;
        double priceRoses = 0.0;
        double priceTulips = 0.0;
        //	            Хризантеми	       Рози	          Лалета
        //Пролет / Лято	2.00 лв./бр.	4.10 лв./бр.	2.50 лв./бр.
        //Есен / Зима	3.75 лв./бр.	4.50 лв./бр.	4.15 лв./бр.

        if (yesOrNoHoliday.equalsIgnoreCase("Y")) {
            if (season.equalsIgnoreCase("Spring") || season.equalsIgnoreCase("Summer")) {
                priceChrysanthemums = numChrysanthemums * (2.00 + (2.00 * 0.15));
                priceRoses = numRoses * (4.10 + (4.10 * 0.15));
                priceTulips = numTulips * (2.50 + (2.50 * 0.15));
                totalPriceFlowers = priceRoses + priceChrysanthemums + priceTulips + 2;


            } else if (season.equalsIgnoreCase("Autumn") || season.equalsIgnoreCase("Winter")) {
                priceChrysanthemums = numChrysanthemums * (3.75 + (3.75 * 0.15));
                priceRoses = numRoses * (4.50 + (4.50 * 0.15));
                priceTulips = numTulips * (4.15 + (4.15 * 0.15));
                totalPriceFlowers = priceRoses + priceChrysanthemums + priceTulips + 2;


            }
        } else if (yesOrNoHoliday.equalsIgnoreCase("N")) {
            if (season.equalsIgnoreCase("Spring") || season.equalsIgnoreCase("Summer")) {
                priceChrysanthemums = numChrysanthemums * 2.00;
                priceRoses = numRoses * 4.10;
                priceTulips = numTulips * 2.50;
                totalPriceFlowers = priceRoses + priceChrysanthemums + priceTulips + 2;


            } else if (season.equalsIgnoreCase("Autumn") || season.equalsIgnoreCase("Winter")) {
                priceChrysanthemums = numChrysanthemums * 3.75;
                priceRoses = numRoses * 4.50;
                priceTulips = numTulips * 4.15;
                totalPriceFlowers = priceRoses + priceChrysanthemums + priceTulips + 2;


            }
        }
        if ((numRoses + numChrysanthemums + numTulips) >= 20 && numRoses >= 10 && season.equalsIgnoreCase("Winter")) {

            totaPriceFlowersdiscount = priceRoses + priceChrysanthemums + priceTulips - ((priceRoses + priceChrysanthemums + priceTulips) * 0.2);
            totalPriceFlowers = totaPriceFlowersdiscount - (totaPriceFlowersdiscount * 0.1) + 2;
        } else if ((numRoses + numChrysanthemums + numTulips) >= 20 && numTulips >= 7 && season.equalsIgnoreCase("Spring")) {

            totaPriceFlowersdiscount = priceRoses + priceChrysanthemums + priceTulips - ((priceRoses + priceChrysanthemums + priceTulips) * 0.2);
            totalPriceFlowers = totaPriceFlowersdiscount - (totaPriceFlowersdiscount * 0.05) + 2;
        } else if ((numRoses + numChrysanthemums + numTulips) >= 20) {
            totalPriceFlowers = priceRoses + priceChrysanthemums + priceTulips - ((priceRoses + priceChrysanthemums + priceTulips) * 0.2) + 2;
        } else if (numRoses >= 10 && season.equalsIgnoreCase("Winter")) {
            totalPriceFlowers = priceRoses + priceChrysanthemums + priceTulips - ((priceRoses + priceChrysanthemums + priceTulips) * 0.1) + 2;
        } else if (numTulips >= 7 && season.equalsIgnoreCase("Spring")) {
            totalPriceFlowers = priceRoses + priceChrysanthemums + priceTulips - ((priceRoses + priceChrysanthemums + priceTulips) * 0.05) + 2;
        }

        System.out.printf("%.2f", totalPriceFlowers);
    }

}


