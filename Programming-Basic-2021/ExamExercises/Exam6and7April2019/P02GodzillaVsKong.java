package ExamExercises.Exam6and7April2019;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int numStatists = Integer.parseInt(scanner.nextLine());
        double priceOfClothing = Double.parseDouble(scanner.nextLine());

        double decorBudget = filmBudget * 0.1;
        double neededBudgetStatists = numStatists * priceOfClothing;

        if (numStatists > 150) {
            neededBudgetStatists *= 0.90;

        }
        double totalNeededBudget = neededBudgetStatists + decorBudget;
        double diff = Math.abs(totalNeededBudget - filmBudget);

        if (totalNeededBudget > filmBudget) {
            System.out.printf("Not enough money!\n" +
                    "Wingard needs %.2f leva more.", diff);
        } else {
            System.out.printf("Action!\n" +
                    "Wingard starts filming with %.2f leva left.", diff);
        }


    }
}
