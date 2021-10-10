package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P04GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePlayer1 = scanner.nextLine();
        String namePlayer2 = scanner.nextLine();
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int pointsPlayer1 = 0;
        int pointsPlayer2 = 0;
        boolean isNumberWars = false;
        String nameWinner = "";
        int pointsWinner = 0;

        while (!input1.equals("End of game")){

            int cardPlayer1 = Integer.parseInt(input1);
            int cardPlayer2 = Integer.parseInt(input2);

            if (cardPlayer1 > cardPlayer2){
                pointsPlayer1 += (cardPlayer1 - cardPlayer2);
            }else if (cardPlayer2 > cardPlayer1){
                pointsPlayer2 += (cardPlayer2 - cardPlayer1);
            }else{
                isNumberWars = true;
                int extraCard1 = Integer.parseInt(scanner.nextLine());
                int extraCard2 = Integer.parseInt(scanner.nextLine());
                    if (extraCard1 > extraCard2){
                      nameWinner = namePlayer1;
                      pointsWinner = pointsPlayer1;
                      break;
                    }else if(extraCard2 > extraCard1){
                        nameWinner = namePlayer2;
                        pointsWinner = pointsPlayer2;
                        break;
                    }

            }



            input1 = scanner.nextLine();
            if(input1.equals("End of game")){
                break;
            }
            input2 = scanner.nextLine();
        }
        String output = "";
        if (isNumberWars){
            output = String.format("Number wars!\n" +
                    "%s is winner with %d points", nameWinner, pointsWinner);

        }else{
            output = String.format("%s has %d points\n" +
                    "%s has %d points", namePlayer1, pointsPlayer1, namePlayer2, pointsPlayer2);
        }
        System.out.println(output);
    }
}
