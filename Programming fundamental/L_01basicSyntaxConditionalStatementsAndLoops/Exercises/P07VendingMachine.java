package L_01basicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumCoins = 0;
        boolean isEnoughMoney = true;
        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);
           if (coins == 0.1){
               sumCoins += coins;
           }else if (coins == 0.2){
               sumCoins += coins;
           }else if (coins == 0.5){
               sumCoins += coins;
           }else if(coins == 1){
               sumCoins += coins;
           }else if(coins == 2){
               sumCoins += coins;
           }else {
               System.out.printf("Cannot accept %.2f %n", coins);
           }

            input = scanner.nextLine();
        }
        String input2 = scanner.nextLine();
        while (!input2.equals("End")){

            switch (input2) {
                case "Nuts":
                    sumCoins -= 2.0;
                    if(sumCoins < 0) {
                        sumCoins += 2.0;
                        isEnoughMoney = false;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    sumCoins -= 0.7;
                    if(sumCoins < 0) {
                        sumCoins += 0.7;
                        isEnoughMoney = false;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    sumCoins -= 1.5;
                    if(sumCoins < 0) {
                        sumCoins += 1.5;
                        isEnoughMoney = false;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    sumCoins -= 0.8;
                    if(sumCoins < 0) {
                        sumCoins += 0.8;
                        isEnoughMoney = false;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    sumCoins -= 1.0;
                    if(sumCoins < 0) {
                        sumCoins += 1.0;
                        isEnoughMoney = false;
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    input2 = scanner.nextLine();
                    continue;

            }
            if(!isEnoughMoney){
                continue;



            }else {
                System.out.printf("Purchased %s %n", input2);
            }
         input2 = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}
