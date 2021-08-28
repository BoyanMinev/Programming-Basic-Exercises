package L01FirstSpepsInCoding.MoreExercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход

        double mackerelPriceKg = Double.parseDouble(scanner.nextLine());
        double spratPriceKg = Double.parseDouble(scanner.nextLine());
        double bonitoWeight = Double.parseDouble(scanner.nextLine());
        double scadWeight = Double.parseDouble(scanner.nextLine());
        int musselsWeight = Integer.parseInt(scanner.nextLine());

        //Пресмятания

        double bonitoPriceKg = mackerelPriceKg + (mackerelPriceKg * 0.6);
        double scadPriceKg = spratPriceKg + (spratPriceKg * 0.8);

        double bonitoPrice = bonitoPriceKg * bonitoWeight;
        double scadPrice = scadPriceKg * scadWeight;
        double musselsPrice = musselsWeight * 7.50;

        double totalFishPrice = bonitoPrice + scadPrice + musselsPrice;

        //Отпечатване на изход

        System.out.printf("%.2f", totalFishPrice);

    }
}
