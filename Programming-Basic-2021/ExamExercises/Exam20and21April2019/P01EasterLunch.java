package ExamExercises.Exam20and21April2019;

import java.util.Scanner;

public class P01EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEasterCakes = Integer.parseInt(scanner.nextLine());
        int numEggshells = Integer.parseInt(scanner.nextLine());
        int cookiesInKg = Integer.parseInt(scanner.nextLine());


        double priceForEasterCakes = 3.20 * numEasterCakes;
        double priceForEggshells = 4.35 * numEggshells;
        double priceForCookies = 5.40 * cookiesInKg;
        double priceForPaintForEgg = numEggshells * 12 * 0.15;

        double totalPrice = priceForCookies + priceForEggshells + priceForEasterCakes + priceForPaintForEgg;

        System.out.printf("%.2f", totalPrice);
    }
}
