package L04ForLoop.MoreExercises;

import java.util.Scanner;

public class P01BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double heritageMoney = Double.parseDouble(scanner.nextLine());
        int yearUntilMustLive = Integer.parseInt(scanner.nextLine());
        double spendMoney = 0.0;
        int yearsOfAge = 0;

        for (int i = 1800; i <= yearUntilMustLive ; i++) {
            yearsOfAge ++;
            if (i % 2 == 0){
                spendMoney += 12000;
            }else{
                spendMoney += 12000 + 50 * (yearsOfAge + 17);
            }


        }
        double diff = Math.abs(heritageMoney - spendMoney);

        if (heritageMoney >= spendMoney){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);

        }else{
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }
    }
}
