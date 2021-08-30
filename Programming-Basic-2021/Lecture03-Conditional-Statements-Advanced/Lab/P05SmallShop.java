package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        if (city.equalsIgnoreCase("Sofia")){
            //0.50	0.80	1.20	1.45	1.60
            switch(product){
                case "coffee": price =0.50;break;
                case "water": price =0.80;break;
                case "beer": price =1.20;break;
                case "sweets": price =1.45;break;
                case "peanuts": price =1.60;break;
            }
        }else if (city.equalsIgnoreCase("Plovdiv")){
            //0.40	0.70	1.15	1.30	1.50
            switch(product){
                case "coffee": price =0.40;break;
                case "water": price =0.70;break;
                case "beer": price =1.15;break;
                case "sweets": price =1.30;break;
                case "peanuts": price =1.50;break;

            }

        }else if (city.equalsIgnoreCase("Varna")){
            //0.45	0.70	1.10	1.35	1.55
            switch(product){
                case "coffee": price =0.45;break;
                case "water": price =0.70;break;
                case "beer": price =1.10;break;
                case "sweets": price =1.35;break;
                case "peanuts": price =1.55;break;
            }
        }
        System.out.println(quantity * price);
    }
}
