package ExamExercises.Exam6And7July2019;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int winner = Integer.MIN_VALUE;
        String nameOfWinner = "";
        int pointsWinner = 0;

        while(!input.equals("Stop")){
            int pointsPlayer = 0;

            for (int i = 0; i < input.length() ; i++) {

                int num = Integer.parseInt(scanner.nextLine());
                char symbol = input.charAt(0 + i);

                if (num == symbol){
                    pointsPlayer += 10;

                }else {
                    pointsPlayer += 2;
                }

            }
            if (pointsPlayer > winner){
                winner = pointsPlayer;
                pointsWinner = pointsPlayer;
                nameOfWinner = input;

            }else if(pointsPlayer == winner){
                nameOfWinner = input;
                pointsWinner = pointsPlayer;
            }


            input = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", nameOfWinner, pointsWinner);
    }
}
