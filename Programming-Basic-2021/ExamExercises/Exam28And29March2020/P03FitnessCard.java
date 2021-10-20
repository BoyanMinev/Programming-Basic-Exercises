package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double allAvailableSum = Double.parseDouble(scanner.nextLine());
       String input = scanner.nextLine();
       char gender = input.charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double priceCard = 0;

        if (gender == 109) {

            switch (sport) {
                case "Gym":
                    priceCard += 42;
                    break;
                case "Boxing":
                    priceCard += 41;
                    break;
                case "Yoga":
                    priceCard += 45;
                    break;
                case "Zumba":
                    priceCard += 34;
                    break;
                case "Dances":
                    priceCard += 51;
                    break;
                case "Pilates":
                    priceCard += 39;
            }
        } else if (gender == 102) {
            switch (sport) {
                case "Gym":
                    priceCard += 35;
                    break;
                case "Boxing":
                    priceCard += 37;
                    break;
                case "Yoga":
                    priceCard += 42;
                    break;
                case "Zumba":
                    priceCard += 31;
                    break;
                case "Dances":
                    priceCard += 53;
                    break;
                case "Pilates":
                    priceCard += 37;
                    break;
            }


        }
        if (age <= 19){
            priceCard *= 0.8;
        }
        if (allAvailableSum >= priceCard){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }else {
            double diff = priceCard - allAvailableSum;
            System.out.printf("You don't have enough money! You need $%.2f more.", diff);
        }

    }
}
