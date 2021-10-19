package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P01ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBitcoin = Integer.parseInt(scanner.nextLine());
        double numChinesMoney = Double.parseDouble(scanner.nextLine());
        double commissions = Double.parseDouble(scanner.nextLine());

        double moneyFromBitcoinToLv = (numBitcoin * 1168);
        double moneyFromChinesToDollars = numChinesMoney * 0.15;
        double moneyFromDollarsToLv = moneyFromChinesToDollars * 1.76;
        double moneyInEuro = (moneyFromBitcoinToLv / 1.95) + (moneyFromDollarsToLv / 1.95);

        moneyInEuro = moneyInEuro - ((moneyInEuro * commissions) / 100);

        System.out.printf("%.2f", moneyInEuro);
    }
}
