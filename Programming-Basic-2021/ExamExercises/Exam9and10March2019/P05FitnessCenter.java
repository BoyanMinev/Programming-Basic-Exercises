package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeopleVisitFitness = Integer.parseInt(scanner.nextLine());
        int numTrainingBack = 0;
        int numTrainingChest = 0;
        int numTrainingLegs = 0;
        int numTrainingAbs = 0;
        int numBuyProteinShake = 0;
        int numBuyProteinBar = 0;
        int numTrainingPeople = 0;
        int numConsummateProtein = 0;

        for (int i = 0; i < numPeopleVisitFitness; i++) {

            String activity = scanner.nextLine();

            switch (activity){
                case "Back":
                    numTrainingBack ++;
                    numTrainingPeople++;
                break;
                case "Chest":
                    numTrainingChest ++;
                    numTrainingPeople++;
                    break;
                case "Legs":
                    numTrainingLegs ++;
                    numTrainingPeople++;
                    break;
                case "Abs":
                    numTrainingAbs ++;
                    numTrainingPeople++;
                    break;
                case "Protein shake":
                    numBuyProteinShake++;
                    numConsummateProtein++;
                    break;
                case "Protein bar":
                    numBuyProteinBar++;
                    numConsummateProtein++;
                    break;
            }


        }
        double averageWorkOutPeople = (1.0 * numTrainingPeople / numPeopleVisitFitness) * 100;
        double averageConsummateProtein = (1.0 * numConsummateProtein / numPeopleVisitFitness) * 100;

        System.out.printf("%d - back\n" +
                "%d - chest\n" +
                "%d - legs\n" +
                "%d - abs\n" +
                "%d - protein shake\n" +
                "%d - protein bar\n" +
                "%.2f%% - work out\n" +
                "%.2f%% - protein", numTrainingBack, numTrainingChest, numTrainingLegs, numTrainingAbs, numBuyProteinShake, numBuyProteinBar, averageWorkOutPeople, averageConsummateProtein);
    }
}
