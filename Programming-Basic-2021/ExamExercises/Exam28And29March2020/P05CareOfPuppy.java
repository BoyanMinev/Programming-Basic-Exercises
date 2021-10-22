package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFoodInKg = Integer.parseInt(scanner.nextLine());

        int boughtFoodInG = boughtFoodInKg * 1000;
        int totalEatingFood = 0;

        String input = scanner.nextLine();
        boolean isEnough = true;

        while(!input.equals("Adopted")){

            int eatingFood = Integer.parseInt(input);

            totalEatingFood +=eatingFood;



            if ( boughtFoodInG < totalEatingFood){
                isEnough = false;

            }



            input = scanner.nextLine();
        }
        int diff = Math.abs(boughtFoodInG - totalEatingFood);
        if (!isEnough){

            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }else {


            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        }
    }
}
