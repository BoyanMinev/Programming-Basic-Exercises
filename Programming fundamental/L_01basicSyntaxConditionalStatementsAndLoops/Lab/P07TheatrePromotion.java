package L_01basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int priceForTicket = 0;


        //Day / Age	0 <= age <= 18	18 < age <= 64	64 < age <= 122
        //Weekday	    12$	                  18$	            12$
        //Weekend	    15$	                  20$	            15$
        //Holiday	    5$	                  12$	            10$

        if (age >= 0 && age <= 18){
            switch (typeDay){
                case "Weekday":
                    priceForTicket = 12;
                    break;
                case "Weekend":
                    priceForTicket = 15;
                    break;
                case "Holiday":
                    priceForTicket = 5;
                    break;

            }
        }else if (age > 18 && age <= 64){
            switch (typeDay){
                case "Weekday":
                    priceForTicket = 18;
                    break;
                case "Weekend":
                    priceForTicket = 20;
                    break;
                case "Holiday":
                    priceForTicket = 12;
                    break;

            }
        }else if (age > 64 && age <= 122){
            switch (typeDay){
                case "Weekday":
                    priceForTicket = 12;
                    break;
                case "Weekend":
                    priceForTicket = 15;
                    break;
                case "Holiday":
                    priceForTicket = 10;
                    break;

            }
        }else {
            System.out.println("Error!");
            return;
        }
        System.out.printf("%d$",priceForTicket);
    }
}
