package L01FirstSpepsInCoding.Lab;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfDogs = Integer.parseInt(scanner.nextLine());
        int numOfOtherAnimals = Integer.parseInt(scanner.nextLine());
        // priceOfPackageDogFood = 2.50lv
        // otherFood = 4.00lv

        double priceFoodDogs = numOfDogs * 2.50;
        double priceFoodForOtherAnimals = numOfOtherAnimals * 4.00;
        double totalValueForFood = priceFoodForOtherAnimals + priceFoodDogs;

        System.out.printf("%.1f lv.", totalValueForFood);
    }

}
