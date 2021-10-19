package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walkingInMinutes = Integer.parseInt(scanner.nextLine());
        int countWalksPerDay = Integer.parseInt(scanner.nextLine());
        int eatenCalories = Integer.parseInt(scanner.nextLine());



        int totalWalkingInMinutes = walkingInMinutes * countWalksPerDay;

        int burnedCalories = totalWalkingInMinutes * 5;

        if (burnedCalories >= (eatenCalories * 0.5)){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }


    }
}
