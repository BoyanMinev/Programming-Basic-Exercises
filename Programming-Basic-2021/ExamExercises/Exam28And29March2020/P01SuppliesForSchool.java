package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P01SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPens = Integer.parseInt(scanner.nextLine());
        int numMarker = Integer.parseInt(scanner.nextLine());
        double cleaningAgent = Double.parseDouble(scanner.nextLine());
        int percentageDiscount = Integer.parseInt(scanner.nextLine());

        double totalPrice = (numPens * 5.80) + (numMarker * 7.20) + (cleaningAgent * 1.20);
        totalPrice -= (totalPrice * percentageDiscount ) / 100;

        System.out.printf("%.3f", totalPrice);
    }
}
