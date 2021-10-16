package ExamExercises.Exam20and21April2019;

import java.util.Scanner;

public class P01EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlourFor1kg = Double.parseDouble(scanner.nextLine());
        double flourInKg = Double.parseDouble(scanner.nextLine());
        double sugarInKg = Double.parseDouble(scanner.nextLine());
        int numEggShells = Integer.parseInt(scanner.nextLine());
        int packetsOfYeast = Integer.parseInt(scanner.nextLine());

        double priceForFlour = priceFlourFor1kg * flourInKg;
        double priceForSugar = (priceFlourFor1kg * 0.75) * sugarInKg;
        double priceForEggShells = (priceFlourFor1kg * 1.1) * numEggShells;
        double priceForPacketsOfYeast = (priceFlourFor1kg * 0.75 * 0.2) * packetsOfYeast;

        double totalPrice = priceForFlour + priceForSugar + priceForEggShells + priceForPacketsOfYeast;

        System.out.printf("%.2f", totalPrice);
    }
}
