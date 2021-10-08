package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P03WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFinal = scanner.nextLine();
        String typeOfTicket = scanner.nextLine();
        int numTicket = Integer.parseInt(scanner.nextLine());
        String trophySymbol = scanner.nextLine();

        double priceTicket = 0;

        if (typeOfTicket.equalsIgnoreCase("Standard")){
            switch(typeOfFinal){
                case "Quarter final":
                    priceTicket += 55.50;
                    break;
                case "Semi final":
                    priceTicket+=75.88;
                    break;
                case "Final":
                    priceTicket += 110.10;
                    break;
            }
        }else if(typeOfTicket.equalsIgnoreCase("Premium")){
            switch(typeOfFinal){
                case "Quarter final":
                    priceTicket += 105.20;
                    break;
                case "Semi final":
                    priceTicket+=125.22;
                    break;
                case "Final":
                    priceTicket += 160.66;
                    break;
            }
        }else if(typeOfTicket.equalsIgnoreCase("VIP")){
            switch(typeOfFinal){
                case "Quarter final":
                    priceTicket += 118.90;
                    break;
                case "Semi final":
                    priceTicket+=300.40;
                    break;
                case "Final":
                    priceTicket += 400;
                    break;
            }
        }

        double totalPrice = priceTicket * numTicket;

        if (totalPrice > 4000){
            totalPrice *=0.75;
            if (trophySymbol.equalsIgnoreCase("Y")){
                totalPrice -= numTicket * 40;
            }
        }else if(totalPrice > 2500 && totalPrice <= 4000){
            totalPrice *= 0.90;
        }
        if (trophySymbol.equalsIgnoreCase("Y")){
            totalPrice += numTicket * 40;

        }
        System.out.printf("%.2f", totalPrice);
    }
}
