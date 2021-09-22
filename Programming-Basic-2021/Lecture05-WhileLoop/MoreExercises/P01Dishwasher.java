package L05WhileLoop.MoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBottlesDetergent = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int quantityDetergentInMl = numBottlesDetergent * 750;
        int countWashCycles = 0;
        int numCleanedDishes = 0;
        int numCleanedPots = 0;
        boolean isEnough = true;

        while(!input.equals("End")){

            int numDishes = Integer.parseInt(input);

            countWashCycles++;

            if (countWashCycles % 3 == 0){
                numCleanedPots+=numDishes;
                quantityDetergentInMl -= (numDishes * 15);
            }else{
                numCleanedDishes+=numDishes;
                quantityDetergentInMl -= (numDishes * 5);
            }
            if (quantityDetergentInMl <= 0){
                isEnough = false;
                break;
            }


            input = scanner.nextLine();
        }
        String output = "";

        if (!isEnough){
            output = String.format("Not enough detergent, %d ml. more necessary!",Math.abs(quantityDetergentInMl));

        }else {
            output = String.format("Detergent was enough!%n" +
                    "%d dishes and %d pots were washed.%n" +
                    "Leftover detergent %d ml.", numCleanedDishes, numCleanedPots, quantityDetergentInMl);
        }
        System.out.println(output);

    }
}
