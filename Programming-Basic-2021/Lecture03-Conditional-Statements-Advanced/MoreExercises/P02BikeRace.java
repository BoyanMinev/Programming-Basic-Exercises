package L03ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJuniorsBikers = Integer.parseInt(scanner.nextLine());
        int numSeniorsBikers = Integer.parseInt(scanner.nextLine());
        String typeTrack = scanner.nextLine();

        double totalSumCharity = 0.0;
        double priceToJoinRace = 0.0;

        //Група	    trail	cross-country	downhill	road
        //juniors	5.50	    8	          12.25 	20
        //seniors	  7      	9.50	      13.75	    21.50

        if ((numJuniorsBikers + numSeniorsBikers) >= 50) {
            switch (typeTrack.toLowerCase()) {
                case "trail":
                    priceToJoinRace = (numJuniorsBikers * 5.50) + (numSeniorsBikers * 7);

                    totalSumCharity = priceToJoinRace - (priceToJoinRace * 0.05);
                    break;
                case "cross-country":
                    priceToJoinRace = (numJuniorsBikers * (8 - (8 * 0.25))) + (numSeniorsBikers * (9.50 - (9.50 * 0.25)));

                    totalSumCharity = priceToJoinRace - (priceToJoinRace * 0.05);
                    break;
                case "downhill":
                    priceToJoinRace = (numJuniorsBikers * 12.25) + (numSeniorsBikers * 13.75);

                    totalSumCharity = priceToJoinRace - (priceToJoinRace * 0.05);
                    break;
                case "road":
                    priceToJoinRace = (numJuniorsBikers * 20) + (numSeniorsBikers * 21.50);

                    totalSumCharity = priceToJoinRace - (priceToJoinRace * 0.05);
                    break;
            }

        }
        else if ((numJuniorsBikers + numSeniorsBikers) < 50){
            switch (typeTrack.toLowerCase()) {
                case "trail":
                    priceToJoinRace = (numJuniorsBikers * 5.50) + (numSeniorsBikers * 7);

                    totalSumCharity = priceToJoinRace - (priceToJoinRace * 0.05);
                    break;
                case "cross-country":
                    priceToJoinRace = (numJuniorsBikers * 8) + (numSeniorsBikers * 9.50);

                    totalSumCharity = priceToJoinRace - (priceToJoinRace * 0.05);
                    break;
                case "downhill":
                    priceToJoinRace = (numJuniorsBikers * 12.25) + (numSeniorsBikers * 13.75);

                    totalSumCharity = priceToJoinRace - (priceToJoinRace * 0.05);
                    break;
                case "road":
                    priceToJoinRace = (numJuniorsBikers * 20) + (numSeniorsBikers * 21.50);

                    totalSumCharity = priceToJoinRace - (priceToJoinRace * 0.05);
                    break;
            }
        }
        System.out.printf("%.2f", totalSumCharity);
    }
}
