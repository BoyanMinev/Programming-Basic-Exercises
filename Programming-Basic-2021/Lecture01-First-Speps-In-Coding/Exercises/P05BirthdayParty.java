package L01FirstSpepsInCoding.Exercises;

import java.util.Scanner;

public class P05BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        int rentHall = Integer.parseInt(scanner.nextLine());

        //Пресмятания


        double priceCake = rentHall * 20 / 100;
        double priceDrinks = priceCake - (priceCake * 45 / 100);
        double priceAnimator = rentHall * 1 / 3;
        double neededPriceTotal = rentHall + priceDrinks + priceCake + priceAnimator;
        //Принтиране на резултата

        System.out.println(neededPriceTotal);
    }
}
