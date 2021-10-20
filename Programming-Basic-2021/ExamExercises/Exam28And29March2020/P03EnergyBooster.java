package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();

        String typeSets = scanner.nextLine();

        int numOrder = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        if (typeSets.equalsIgnoreCase("small")){
            switch(fruit){
                case "Watermelon":
                    totalPrice += 56 * numOrder * 2;
                    break;
                case "Mango":
                    totalPrice += 36.66 * numOrder * 2;
                    break;
                case "Pineapple":
                    totalPrice += 42.10 * numOrder * 2;
                    break;
                case "Raspberry":
                    totalPrice += 20 * numOrder * 2;
                    break;
            }
        }else if (typeSets.equalsIgnoreCase("big")){

            switch(fruit){
                case "Watermelon":
                    totalPrice += 28.70 * numOrder * 5;
                    break;
                case "Mango":
                    totalPrice += 19.60 * numOrder * 5;
                    break;
                case "Pineapple":
                    totalPrice += 24.80 * numOrder * 5;
                    break;
                case "Raspberry":
                    totalPrice += 15.20 * numOrder * 5;
                    break;
            }
        }
        if (totalPrice >= 400 && totalPrice <= 1000){
            totalPrice *= 0.85;
        }else if (totalPrice > 1000){
            totalPrice *= 0.5;
        }
        System.out.printf("%.2f lv.", totalPrice);
    }
}
