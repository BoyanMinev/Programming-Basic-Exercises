package ExamExercises.Exam18And19July2020;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int redBallsPoints = 0;
        int orangeBallsPoints = 0;
        int yellowBallsPoints = 0;
        int whiteBallsPoints = 0;
        int blackBallsPoints = 0;
        int otherBalls = 0;

        for (int i = 1; i <= n; i++) {

            String color = scanner.nextLine();

            switch (color){
                case "red":
                    totalPoints+= 5;
                    redBallsPoints++;
                    break;
                case "orange":
                    totalPoints+=10;
                    orangeBallsPoints++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowBallsPoints++;
                    break;
                case "white":
                    totalPoints += 20;
                    whiteBallsPoints++;
                    break;
                case "black":
                    totalPoints /= 2;
                    blackBallsPoints++;
                    break;
                default:
                    otherBalls++;
                    break;


            }


        }
        System.out.printf("Total points: %d\n" +
                "Points from red balls: %d\n" +
                "Points from orange balls: %d\n" +
                "Points from yellow balls: %d\n" +
                "Points from white balls: %d\n" +
                "Other colors picked: %d\n" +
                "Divides from black balls: %d", totalPoints, redBallsPoints, orangeBallsPoints, yellowBallsPoints, whiteBallsPoints, otherBalls, blackBallsPoints);

    }
}
