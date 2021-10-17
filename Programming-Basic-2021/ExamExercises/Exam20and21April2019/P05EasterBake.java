package ExamExercises.Exam20and21April2019;

import java.util.Scanner;

public class P05EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfEasterCakes = Integer.parseInt(scanner.nextLine());
        double numPacketsFlour = 0;
        double numPacketsSugar = 0;
        int maxUsedFlour = Integer.MIN_VALUE;
        int maxUsedSugar = Integer.MIN_VALUE;
        int sumFlour = 0;
        int sumSugar = 0;
        for (int i = 0; i < numOfEasterCakes; i++) {

            int quantitySugarInGr = Integer.parseInt(scanner.nextLine());
            int quantityFlourInGr = Integer.parseInt(scanner.nextLine());

            sumFlour +=quantityFlourInGr;
            sumSugar +=quantitySugarInGr;
            if (quantityFlourInGr > maxUsedFlour){
                maxUsedFlour = quantityFlourInGr;
            }
            if (quantitySugarInGr > maxUsedSugar){
                maxUsedSugar = quantitySugarInGr;
            }

        }
        numPacketsFlour = Math.ceil(1.0 * sumFlour / 750);
        numPacketsSugar = Math.ceil(1.0 *sumSugar / 950);

        System.out.printf("Sugar: %.0f\n" +
                "Flour: %.0f\n" +
                "Max used flour is %d grams, max used sugar is %d grams.", numPacketsSugar, numPacketsFlour, maxUsedFlour, maxUsedSugar);
    }
}
