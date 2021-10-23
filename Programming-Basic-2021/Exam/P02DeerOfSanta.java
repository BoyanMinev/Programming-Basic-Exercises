package Exam;

import java.util.Scanner;

public class P02DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDaysSantaMiss = Integer.parseInt(scanner.nextLine());
        int leftFoodInKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayForFirstDeer = Double.parseDouble(scanner.nextLine());
        double foodPerDayForSecondDeer = Double.parseDouble(scanner.nextLine());
        double foodPerDayForThirdDeer = Double.parseDouble(scanner.nextLine());

        double totalFoodsForFirstDeer = foodPerDayForFirstDeer * numOfDaysSantaMiss;
        double totalFoodsForSecondDeer = foodPerDayForSecondDeer * numOfDaysSantaMiss;
        double totalFoodsForThirdDeer = foodPerDayForThirdDeer * numOfDaysSantaMiss;

        double allNeededFoods = totalFoodsForFirstDeer + totalFoodsForSecondDeer + totalFoodsForThirdDeer;

        if (leftFoodInKg >= allNeededFoods){
            double diff1 = Math.floor(leftFoodInKg - allNeededFoods);

            System.out.printf("%.0f kilos of food left.", diff1);
        }else {
            double diff2 = Math.ceil(allNeededFoods - leftFoodInKg);
            System.out.printf("%.0f more kilos of food are needed.", diff2);
        }
    }
}
