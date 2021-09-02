package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        int degrees = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        //Изчисления
        String outfit = "";
        String shoes = "";

        if (degrees >= 10 && degrees <= 18) {
            switch (timeOfDay.toLowerCase()) {
                case "morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;

            }
        } else if (degrees > 18 && degrees <= 24) {
            switch (timeOfDay.toLowerCase()) {
                case "morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        } else if (degrees >= 25) {
            switch (timeOfDay.toLowerCase()) {
                case "morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }


        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}