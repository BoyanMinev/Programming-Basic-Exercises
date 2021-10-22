package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDaysTournament = Integer.parseInt(scanner.nextLine());

        int countLoseDay =0;
        int countWinDay = 0;
        double totalEarnedMoney = 0;
        for (int i = 1; i <= numDaysTournament ; i++) {
            int countWins = 0;
            int countLose = 0;
            String input = scanner.nextLine();
            double earnedMoneyPerADay = 0;


            while (!input.equals("Finish")) {

               String result = scanner.nextLine();

               if (result.equals("win")){
                   countWins++;
                   earnedMoneyPerADay+= 20;

               }else {
                   countLose++;
               }

                input = scanner.nextLine();
            }
            if (countWins > countLose){
                countWinDay++;
                earnedMoneyPerADay *= 1.1;

            }else{
                countLoseDay++;
            }
            totalEarnedMoney += earnedMoneyPerADay;



        }
        if(countWinDay > countLoseDay){
            totalEarnedMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalEarnedMoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalEarnedMoney);
        }

    }
}
