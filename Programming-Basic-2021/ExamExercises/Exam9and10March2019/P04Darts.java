package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P04Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namePlayer = scanner.nextLine();
        String input = scanner.nextLine();
        int pointsEndGame = 301;
        boolean isWinner = false;

        int countSuccessfulShots = 0;
        int countUnsuccessfulShots = 0;


        while (!input.equals("Retire")) {

            int points = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case "Single":
                    pointsEndGame -= points;
                    if (pointsEndGame < 0) {
                        countUnsuccessfulShots++;
                        pointsEndGame += points;
                        input = scanner.nextLine();
                        continue;
                    }
                    countSuccessfulShots++;
                    break;
                case "Double":
                    pointsEndGame -= (2 * points);
                    if (pointsEndGame < 0) {
                        countUnsuccessfulShots++;
                        pointsEndGame += (2 * points);
                        input = scanner.nextLine();
                        continue;
                    }
                    countSuccessfulShots++;
                    break;
                case "Triple":
                    pointsEndGame -= (3 * points);
                    if (pointsEndGame < 0) {
                        countUnsuccessfulShots++;
                        pointsEndGame += (3 * points);
                        input = scanner.nextLine();
                        continue;
                    }
                    countSuccessfulShots++;
                    break;


            }
            if (pointsEndGame == 0) {
                isWinner = true;
                break;
            }


            input = scanner.nextLine();
        }
        String output = "";
        if (isWinner) {
            output = String.format("%s won the leg with %d shots.", namePlayer, countSuccessfulShots);
        } else {
            output = String.format("%s retired after %d unsuccessful shots.", namePlayer, countUnsuccessfulShots);
        }
        System.out.println(output);
    }
}