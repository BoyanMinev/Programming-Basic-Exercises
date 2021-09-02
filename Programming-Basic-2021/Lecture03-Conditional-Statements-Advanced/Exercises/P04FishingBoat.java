package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numFisher = Integer.parseInt(scanner.nextLine());

        double priceForRentShip = 0.0;
        double differentSum = 0.0;
        //•	Цената за наем на кораба през пролетта е  3000 лв.
        //•	Цената за наем на кораба през лятото и есента е  4200 лв.
        //•	Цената за наем на кораба през зимата е  2600 лв.


        //•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
        //•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
        //•	Ако групата е от 12 нагоре  –  отстъпка от 25%.
        //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен
        // ако не е есен - тогава нямат допълнителна отстъпка.


        if (numFisher <= 6 && numFisher % 2 == 0) {
            switch (season.toLowerCase()) {
                case "spring":
                    priceForRentShip = 3000 - (3000 * 0.15);
                    break;
                case "summer":
                    priceForRentShip = 4200 - (4200 * 0.15);
                    break;
                case "autumn":
                    priceForRentShip = 4200 - (4200 * 0.10);
                    break;
                case "winter":
                    priceForRentShip = 2600 - (2600 * 0.15);
                    break;

            }


        }
        if (numFisher <= 6 && numFisher % 2 != 0) {
            switch (season.toLowerCase()) {
                case "spring":
                    priceForRentShip = 3000 - (3000 * 0.10);
                    break;
                case "summer":
                    priceForRentShip = 4200 - (4200 * 0.10);
                    break;
                case "autumn":
                    priceForRentShip = 4200 - (4200 * 0.1);
                    break;
                case "winter":
                    priceForRentShip = 2600 - (2600 * 0.10);
                    break;
            }
        }
        if (numFisher <= 11 && numFisher > 6 && numFisher % 2 == 0) {
            switch (season.toLowerCase()) {
                case "spring":
                    priceForRentShip = 3000 - (3000 * 0.20);
                    break;
                case "summer":
                    priceForRentShip = 4200 - (4200 * 0.20);
                    break;
                case "autumn":
                    priceForRentShip = 4200 - (4200 * 0.15);
                    break;
                case "winter":
                    priceForRentShip = 2600 - (2600 * 0.20);
                    break;
            }
        }
        if (numFisher <= 11 && numFisher > 6 && numFisher % 2 != 0) {
            switch (season.toLowerCase()) {
                case "spring":
                    priceForRentShip = 3000 - (3000 * 0.15);
                    break;
                case "summer":
                    priceForRentShip = 4200 - (4200 * 0.15);
                    break;
                case "autumn":
                    priceForRentShip = 4200 - (4200 * 0.15);
                    break;
                case "winter":
                    priceForRentShip = 2600 - (2600 * 0.15);
                    break;
            }
        }
        if (numFisher >= 12 && numFisher % 2 == 0) {
            switch (season.toLowerCase()) {
                case "spring":
                    priceForRentShip = 3000 - (3000 * 0.30);
                    break;
                case "summer":
                    priceForRentShip = 4200 - (4200 * 0.30);
                    break;
                case "autumn":
                    priceForRentShip = 4200 - (4200 * 0.25);
                    break;
                case "winter":
                    priceForRentShip = 2600 - (2600 * 0.30);
                    break;
            }
        }
        if (numFisher >= 12 && numFisher % 2 != 0) {
            switch (season.toLowerCase()) {
                case "spring":
                    priceForRentShip = 3000 - (3000 * 0.25);
                    break;
                case "summer":
                    priceForRentShip = 4200 - (4200 * 0.25);
                    break;
                case "autumn":
                    priceForRentShip = 4200 - (4200 * 0.25);
                    break;
                case "winter":
                    priceForRentShip = 2600 - (2600 * 0.25);
                    break;
            }
        }if (budget >= priceForRentShip){
            differentSum = budget - priceForRentShip;
            System.out.printf("Yes! You have %.2f leva left.", differentSum);
        }else if(priceForRentShip > budget){
            differentSum = priceForRentShip - budget;
            System.out.printf("Not enough money! You need %.2f leva.", differentSum);
        }
    }
}