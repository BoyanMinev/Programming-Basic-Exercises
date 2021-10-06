package ExamExercises.Exam6And7July2019;

import java.util.Scanner;

public class P05PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countHeartstone = 0;
        int countFornite= 0;
        int countOverwatch = 0;
        int countOthers = 0;
        int countAllGames = 0;

        for (int i = 0; i < n; i++) {

            String nameOfGame = scanner.nextLine();
            countAllGames++;
            switch (nameOfGame){
                case "Hearthstone":
                    countHeartstone ++;
                    break;
                case "Fornite":
                    countFornite++;
                    break;
                case "Overwatch":
                    countOverwatch++;
                    break;
                default:
                    countOthers++;
                    break;
            }
        }
        double percentageGameH = 1.0 * countHeartstone / countAllGames * 100;
        double percentageGameF = 1.0 * countFornite / countAllGames * 100;
        double percentageGameO = 1.0 * countOverwatch / countAllGames * 100;
        double percentageGameOthers = 1.0 * countOthers / countAllGames * 100;

        System.out.printf("Hearthstone - %.2f%%\n" +
                "Fornite - %.2f%%\n" +
                "Overwatch - %.2f%%\n" +
                "Others - %.2f%%", percentageGameH, percentageGameF, percentageGameO,
                percentageGameOthers);
    }
}
