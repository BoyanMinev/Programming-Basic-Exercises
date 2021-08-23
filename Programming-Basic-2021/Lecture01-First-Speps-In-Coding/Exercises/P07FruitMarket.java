package L01FirstSpepsInCoding.Exercises;

import java.util.Scanner;

public class P07FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        double strawberryPriceForKg = Double.parseDouble(scanner.nextLine());
        double bananasInKg = Double.parseDouble(scanner.nextLine());
        double orangeInKg = Double.parseDouble(scanner.nextLine());
        double raspberryInKg = Double.parseDouble(scanner.nextLine());
        double strawberryInKg = Double.parseDouble(scanner.nextLine());
        //Пресмятания
        double raspberryPriceForKg = strawberryPriceForKg * 50 / 100;
        double orangePriceForKg = raspberryPriceForKg - (raspberryPriceForKg * 0.4);
        double bananaPriceForKg = raspberryPriceForKg - (raspberryPriceForKg * 0.8);
        double raspberryPriceTotal = raspberryInKg * raspberryPriceForKg;
        double orangePriceTotal = orangeInKg * orangePriceForKg;
        double bananaPriceTotal = bananasInKg * bananaPriceForKg;
        double strawberryPriceTotal = strawberryInKg * strawberryPriceForKg;
        double totalPriceForAll = strawberryPriceTotal + raspberryPriceTotal + orangePriceTotal + bananaPriceTotal;

        System.out.printf("%.2f" ,totalPriceForAll);
    }
}
