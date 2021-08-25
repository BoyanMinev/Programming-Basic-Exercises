package L02ConditionalStatements.Lab;

import java.util.Scanner;

public class P07ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        //•Пъзел - 2.60 лв.
        //•Говореща кукла -3 лв.
        //•Плюшено мече -4.10 лв.
        //•Миньон - 8.20 лв.
        //•Камионче - 2 лв.

        double puzzlesPrice = 2.60;
        double dollPrice = 3.00;
        double teddyBearsPrice = 4.10;
        double minionsPrice = 8.20;
        double truckPrice = 2.00;

        double totalSoldToys = (puzzlesPrice * puzzles) + (dollPrice * dolls) + (teddyBearsPrice * teddyBears) +
                (minionsPrice * minions) + (truckPrice * trucks);
        int totalToysCount = puzzles + dolls + teddyBears+minions+trucks;

        if (totalToysCount>= 50){
            totalSoldToys = totalSoldToys - (totalSoldToys * 0.25);
        }
        totalSoldToys = totalSoldToys - (totalSoldToys * 0.10);
        if(totalSoldToys>=holidayPrice){
            double leftMoneys = totalSoldToys-holidayPrice;
            System.out.printf("Yes! %.2f lv left.",leftMoneys);
        }else{
            double moneyNeeded = holidayPrice - totalSoldToys;
            System.out.printf("Not enough money! %.2f lv needed.",moneyNeeded);
        }

    }
}
