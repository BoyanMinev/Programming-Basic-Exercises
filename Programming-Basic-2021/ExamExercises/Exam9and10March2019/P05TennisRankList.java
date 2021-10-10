package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P05TennisRankList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTournamentWhichPlayed = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0;
        int winningTours = 0;


        for (int i = 0; i < numTournamentWhichPlayed; i++) {

            String roundTournament = scanner.nextLine();

            switch (roundTournament){
                case "W":
                    winningTours++;
                    totalPoints += 2000;
                    break;
                case "F":
                    totalPoints +=1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }



        }
       int  pointsOfTour = totalPoints;
        totalPoints+=startingPoints;
        double averageWinsTours = (1.0 * winningTours / numTournamentWhichPlayed) * 100;
            int averagePointsTours = pointsOfTour / numTournamentWhichPlayed;
        System.out.printf("Final points: %d\n" +
                "Average points: %d\n" +
                "%.2f%%", totalPoints, averagePointsTours, averageWinsTours);
    }
}
