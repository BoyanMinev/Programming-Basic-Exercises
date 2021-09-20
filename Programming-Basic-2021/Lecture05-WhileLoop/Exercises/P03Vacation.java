package L05WhileLoop.Exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        boolean isFailed = false;
        int allDays = 0;

        while(excursionPrice > currentMoney){

            String action = scanner.nextLine();

            double money = Double.parseDouble(scanner.nextLine());
            allDays++;

            switch (action) {
                case "spend":
                    currentMoney -= money;
                    if (currentMoney < 0) {
                        currentMoney = 0;
                    }
                    spendDays++;

                    break;
                case "save":
                    currentMoney += money;
                    spendDays = 0;
                    break;
            }
            if (spendDays == 5) {
                isFailed = true;
                break;
            }

        }
        String output = "";
        if (isFailed){
            output = String.format("You can't save the money.%n" +
                    "%d", allDays);
        }else{
            output = String.format("You saved the money for %d days.", allDays);
        }
        System.out.println(output);

    }
}
