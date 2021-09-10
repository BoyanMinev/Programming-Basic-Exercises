package L04ForLoop.Lab;

import java.util.Scanner;

public class P11CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfToys = 0;
        double money = 0;
        double currentBdayMoney = 10.00;

        int n = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        for (int age = 1; age <= n; age++) {
            if (age % 2 != 0){
                countOfToys++;

            }else{
                money += currentBdayMoney;
                currentBdayMoney +=10;
                money --;

            }


        }
        double totalMoney = money + (countOfToys * toyPrice);
        double diff = Math.abs(totalMoney - price);
        if (totalMoney >= price) {
            System.out.printf("Yes! %.2f", diff);


        }else{
            System.out.printf("No! %.2f", diff);
        }



    }
}
