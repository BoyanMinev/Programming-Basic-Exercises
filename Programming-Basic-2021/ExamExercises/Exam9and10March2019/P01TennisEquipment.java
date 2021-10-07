package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P01TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForTennisRacket = Double.parseDouble(scanner.nextLine());
        int numTennisRackets = Integer.parseInt(scanner.nextLine());
        int numPearSneakers = Integer.parseInt(scanner.nextLine());


        double priceForRackets = numTennisRackets * priceForTennisRacket;
        double priceForSneakers = numPearSneakers * (priceForTennisRacket / 6);
        double priceForOtherThings = (priceForRackets + priceForSneakers) * 0.2;

        double totalPriceForPlayer = Math.floor((priceForOtherThings + priceForRackets + priceForSneakers) / 8);
        double totalPriceForSponsors =  Math.ceil((priceForOtherThings + priceForRackets + priceForSneakers) * 7/8);

        System.out.printf("Price to be paid by Djokovic %.0f\n" +
                "Price to be paid by sponsors %.0f", totalPriceForPlayer, totalPriceForSponsors);
    }
}
