package L01FirstSpepsInCoding.MoreExercises;

import java.util.Scanner;

public class P04VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int numOfVegetablesKg = Integer.parseInt(scanner.nextLine());
        int numOfFruitsKg = Integer.parseInt(scanner.nextLine());

        double totalIncome = (priceFruits * numOfFruitsKg) + (priceVegetables * numOfVegetablesKg);
        double totalIncomeInEuro = totalIncome / 1.94;

        System.out.printf("%.2f", totalIncomeInEuro);

    }
}
