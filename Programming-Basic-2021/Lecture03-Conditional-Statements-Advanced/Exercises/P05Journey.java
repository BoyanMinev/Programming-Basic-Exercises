package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double spendMoney = 0.0;
        String destination = "";
        String typeOfResting = "";
        if (budget <= 100) {
            if (season.equalsIgnoreCase("summer")) {
                spendMoney = budget * 0.3;
                destination = "Bulgaria";
                typeOfResting = "Camp";

            } else if (season.equalsIgnoreCase("winter")) {
                spendMoney = budget * 0.7;
                destination = "Bulgaria";
                typeOfResting = "Hotel";

            }


        }
        else if (budget <= 1000 && budget > 100){
            if (season.equalsIgnoreCase("summer")){
                spendMoney = budget * 0.4;
                destination = "Balkans";
                typeOfResting = "Camp";
            }else if (season.equalsIgnoreCase("winter")){
                spendMoney = budget * 0.8;
                destination = "Balkans";
                typeOfResting = "Hotel";
            }
        }else if (budget > 1000){
            spendMoney = budget * 0.9;
            destination = "Europe";
            typeOfResting = "Hotel";
        }

        System.out.printf("Somewhere in %s%n" +
                "%s - %.2f", destination, typeOfResting, spendMoney);
    }
}
