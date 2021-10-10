package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P06BasketballTournaments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameTournament = scanner.nextLine();

        int diff = 0;
        int countWins = 0;
        int countGames = 0;
        while (!nameTournament.equals("End of tournaments")){

            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= n ; i++) {
                countGames++;
                int pointsDesiTeam = Integer.parseInt(scanner.nextLine());
                int pointsOtherTeam = Integer.parseInt(scanner.nextLine());

                if (pointsDesiTeam > pointsOtherTeam){
                    countWins++;
                        diff = Math.abs(pointsDesiTeam - pointsOtherTeam);
                    System.out.printf("Game %d of tournament %s: win with %d points.%n",i, nameTournament, diff);
                }else{
                    diff = Math.abs(pointsDesiTeam - pointsOtherTeam);
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, nameTournament, diff );
                }
            }




            nameTournament = scanner.nextLine();
        }
        double averageWins = 1.0 * countWins / countGames * 100;
        double averageLoses = 100 - averageWins;
        System.out.printf("%.2f%% matches win\n" +
                "%.2f%% matches lost", averageWins, averageLoses);
    }
}
