package L01FirstSpepsInCoding.Exercises;

import java.util.Scanner;

public class P01USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        double usd = Double.parseDouble(scanner.nextLine());

        //Пресмятане на валутите от долари към лева
        double bgn = usd * 1.79549;
        // Принтиране на резултата
        System.out.println(bgn);
    }
}
