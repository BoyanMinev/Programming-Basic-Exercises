package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays = Integer.parseInt(scanner.nextLine());

        double allFoods = Double.parseDouble(scanner.nextLine());
        double totalEatenBiscuits = 0;
        double totalEatenDog = 0;
        double totalEatenCat = 0;
        double totalEatenFood = 0;
        for (int i = 1; i <= numDays; i++) {
            int eatenFoodPerDay = 0;
            int eatenFoodDog = Integer.parseInt(scanner.nextLine());
            int eatenFoodCat = Integer.parseInt(scanner.nextLine());

            eatenFoodPerDay = eatenFoodCat + eatenFoodDog;
            totalEatenDog+=eatenFoodDog;
            totalEatenCat += eatenFoodCat;
            totalEatenFood += eatenFoodCat + eatenFoodDog;
            if (i % 3 == 0){
                totalEatenBiscuits += eatenFoodPerDay * 0.1;

            }


        }
        double percentageTotalEatenFood = totalEatenFood / allFoods * 100;
        double percentageTotalEatenFoodDog = totalEatenDog / totalEatenFood * 100;
        double percentageTotalEatenFoodCat =  totalEatenCat / totalEatenFood * 100;
        System.out.printf("Total eaten biscuits: %.0fgr.\n" +
                "%.2f%% of the food has been eaten.\n" +
                "%.2f%% eaten from the dog.\n" +
                "%.2f%% eaten from the cat.", totalEatenBiscuits, percentageTotalEatenFood, percentageTotalEatenFoodDog, percentageTotalEatenFoodCat );
    }
}
