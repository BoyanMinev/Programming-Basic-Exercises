package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFlowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        //Пресмятания


        double differenceBetweenBudgetAndTotalPrice = 0.0;
        double totalPriceFlowers = 0.0;
        //цвете	                Роза	Далия	Лале	Нарцис	Гладиола
        //Цена на брой в лева	  5	     3.80	2.80	   3	  2.50


        if (typeFlowers.equalsIgnoreCase("Roses") && numFlowers <= 80) {
            totalPriceFlowers = numFlowers * 5;


        }if (typeFlowers.equalsIgnoreCase("Roses") && numFlowers > 80){
            totalPriceFlowers = (numFlowers * 5) - ((numFlowers * 5) * 0.1);


        }if (typeFlowers.equalsIgnoreCase("Dahlias") && numFlowers <= 90){
            totalPriceFlowers = numFlowers * 3.80;


        }if (typeFlowers.equalsIgnoreCase("Dahlias") && numFlowers > 90){
            totalPriceFlowers = (numFlowers * 3.80) - ((numFlowers * 3.80) * 0.15);


        }if (typeFlowers.equalsIgnoreCase("Tulips") && numFlowers <= 80){
            totalPriceFlowers = numFlowers * 2.80;


        }if (typeFlowers.equalsIgnoreCase("Tulips") && numFlowers > 80){
            totalPriceFlowers = (numFlowers * 2.80) - ((numFlowers * 2.80) * 0.15);


        }if (typeFlowers.equalsIgnoreCase("Narcissus") && numFlowers >= 120){
            totalPriceFlowers = numFlowers * 3.00;


        }if (typeFlowers.equalsIgnoreCase("Narcissus") && numFlowers < 120){
            totalPriceFlowers = (numFlowers * 3.00) + ((numFlowers * 3.00) * 0.15);


        }if (typeFlowers.equalsIgnoreCase("Gladiolus") && numFlowers >= 80){
            totalPriceFlowers = numFlowers * 2.50;


        }if (typeFlowers.equalsIgnoreCase("Gladiolus") && numFlowers < 80){
            totalPriceFlowers = (numFlowers * 2.50) + ((numFlowers * 2.50) * 0.20);


        }

        if (totalPriceFlowers <= budget){
            differenceBetweenBudgetAndTotalPrice = budget - totalPriceFlowers;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, typeFlowers, differenceBetweenBudgetAndTotalPrice);

        }else if (totalPriceFlowers > budget){
            differenceBetweenBudgetAndTotalPrice = totalPriceFlowers - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", differenceBetweenBudgetAndTotalPrice);
        }



    }


}

