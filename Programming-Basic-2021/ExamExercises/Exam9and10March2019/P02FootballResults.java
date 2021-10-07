package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P02FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstMatch = scanner.nextLine();
        String secondMatch = scanner.nextLine();
        String thirdMatch = scanner.nextLine();

        char firstMatchTeam2 = firstMatch.charAt(2);
        char firstMatchTeam1 = firstMatch.charAt(0);
        char secondMatchTeam1 = secondMatch.charAt(0);
        char secondMatchTeam2 = secondMatch.charAt(2);
        char thirdMatchTeam1 = thirdMatch.charAt(0);
        char thirdMatchTeam2 = thirdMatch.charAt(2);
        int countWins = 0;
        int countDrawn = 0;
        int countLose = 0;
        if (firstMatchTeam1 > firstMatchTeam2){
            countWins++;
        }else if (firstMatchTeam1 == firstMatchTeam2){
            countDrawn++;
        }else {
            countLose++;

        }if (secondMatchTeam1 > secondMatchTeam2){
            countWins++;
        }else if (secondMatchTeam1 == secondMatchTeam2){
            countDrawn++;
        }else {
            countLose++;
        }if (thirdMatchTeam1 > thirdMatchTeam2){
            countWins++;
        }else if (thirdMatchTeam1 == thirdMatchTeam2){
            countDrawn++;
        }else {
            countLose++;
        }
        System.out.printf("Team won %d games.\n" +
                "Team lost %d games.\n" +
                "Drawn games: %d", countWins, countLose, countDrawn);

    }
}
