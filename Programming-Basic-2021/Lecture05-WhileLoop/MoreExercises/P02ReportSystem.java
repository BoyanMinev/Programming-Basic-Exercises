package L05WhileLoop.MoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumFromSells = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countTransaction = 0;
        int sumCashPayed = 0;
        int sumCardPayed = 0;
        int countCashTransaction = 0;
        int countCardTransaction = 0;

        boolean isEnough = false;

        while(!input.equals("End")){

            int priceOfProducts = Integer.parseInt(input);
            countTransaction++;

            if (countTransaction % 2 == 0){
                if (priceOfProducts < 10){
                    System.out.println("Error in transaction!");
                }else{
                    countCardTransaction++;
                    sumCardPayed += priceOfProducts;
                    System.out.println("Product sold!");
                }

            }else {
                if (priceOfProducts > 100){
                    System.out.println("Error in transaction!");

                }else {
                    countCashTransaction++;
                    sumCashPayed += priceOfProducts;
                    System.out.println("Product sold!");
                }
            }
            if ((sumCashPayed + sumCardPayed) >= sumFromSells){
                isEnough = true;
                break;
            }


            input = scanner.nextLine();
        }
        double averagePayedCash = 1.0 * sumCashPayed / countCashTransaction;
        double averagePayedCard = 1.0 * sumCardPayed / countCardTransaction;
        String output = "";
        if (isEnough) {
            output = String.format("Average CS: %.2f\n" +
                    "Average CC: %.2f", averagePayedCash, averagePayedCard);
        }else {
            output = "Failed to collect required money for charity.";
        }
        System.out.println(output);
    }
}
