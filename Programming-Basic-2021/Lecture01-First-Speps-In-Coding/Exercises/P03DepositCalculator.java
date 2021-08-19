package L01FirstSpepsInCoding.Exercises;

import java.util.Scanner;

public class P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход

        double depositSum = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        //Пресмятания
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * лихвен процент ) / 12)
        double sumPerMonth = depositSum * (interestRate/ 100) / 12;
        double result = depositSum + months * sumPerMonth;


        //Принтиране на резултата

        System.out.println(result);
    }
}
