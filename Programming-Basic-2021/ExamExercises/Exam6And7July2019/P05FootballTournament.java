package ExamExercises.Exam6And7July2019;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFootballTeam = scanner.nextLine();

        int numFinishMatchPerSeason = Integer.parseInt(scanner.nextLine());

        int countWinGame = 0;
        int countDrawGame = 0;
        int countLoseGame = 0;
        int totalPointsPerSeason = 0;
        int countTotalGames = 0;

        if (numFinishMatchPerSeason == 0){
            System.out.printf("%s hasn't played any games during this season.", nameFootballTeam);

        }else {

            for (int i = 0; i < numFinishMatchPerSeason; i++) {

                String symbol = scanner.nextLine();

                countTotalGames ++;

                if (symbol.equalsIgnoreCase("W")){
                    countWinGame++;
                    totalPointsPerSeason += 3;
                }else if(symbol.equalsIgnoreCase("D")){
                    countDrawGame++;
                    totalPointsPerSeason += 1;
                }else if (symbol.equalsIgnoreCase("L")){
                    countLoseGame++;
                }


            }
            double percentageWinGames =1.0 * countWinGame / countTotalGames * 100;
            System.out.printf("%s has won %d points during this season.\n" +
                    "Total stats:\n" +
                    "## W: %d\n" +
                    "## D: %d\n" +
                    "## L: %d\n" +
                    "Win rate: %.2f%%", nameFootballTeam, totalPointsPerSeason, countWinGame,
                    countDrawGame, countLoseGame, percentageWinGames);
        }
    }
}
