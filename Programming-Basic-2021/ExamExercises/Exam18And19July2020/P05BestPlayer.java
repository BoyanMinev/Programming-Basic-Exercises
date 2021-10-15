package ExamExercises.Exam18And19July2020;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        int topPlayer = Integer.MIN_VALUE;

        String currentPlayer = "";

        boolean isMadeHatTrick = false;

        while (!playerName.equals("END")){

            int numGoals = Integer.parseInt(scanner.nextLine());

            if (numGoals > topPlayer){
                topPlayer = numGoals;
                currentPlayer = playerName;
                if (numGoals >= 3){
                    isMadeHatTrick = true;
                }
            }
            if (numGoals >= 10){
                break;
            }


            playerName = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", currentPlayer);

        if (isMadeHatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", topPlayer );
        }else{
            System.out.printf("He has scored %d goals.", topPlayer);
        }

    }
}
