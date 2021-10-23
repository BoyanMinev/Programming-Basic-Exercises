package Exam;

import java.util.Scanner;

public class P03SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDaysAccommodation = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String grade = scanner.nextLine();
        double priceForAccommodation = 0;

        if (numDaysAccommodation < 10){
            switch (typeOfRoom){
                case "room for one person":
                    priceForAccommodation = (numDaysAccommodation - 1) * 18.00;
                    break;
                case "apartment":
                    priceForAccommodation = (numDaysAccommodation -1) * 25.00;
                    priceForAccommodation *= 0.70;
                    break;
                case "president apartment":
                    priceForAccommodation = (numDaysAccommodation -1) * 35.00;
                    priceForAccommodation *= 0.90;
                    break;

            }
        }else if (numDaysAccommodation <= 15){
            switch (typeOfRoom){
                case "room for one person":
                    priceForAccommodation = (numDaysAccommodation - 1) * 18.00;
                    break;
                case "apartment":
                    priceForAccommodation = (numDaysAccommodation -1) * 25.00;
                    priceForAccommodation *= 0.65;
                    break;
                case "president apartment":
                    priceForAccommodation = (numDaysAccommodation -1) * 35.00;
                    priceForAccommodation *= 0.75;
                    break;

            }
        }else  {
            switch (typeOfRoom){
                case "room for one person":
                    priceForAccommodation = (numDaysAccommodation - 1) * 18.00;
                    break;
                case "apartment":
                    priceForAccommodation = (numDaysAccommodation -1) * 25.00;
                    priceForAccommodation *= 0.50;
                    break;
                case "president apartment":
                    priceForAccommodation = (numDaysAccommodation -1) * 35.00;
                    priceForAccommodation *= 0.80;
                    break;

            }
        }
        if (grade.equalsIgnoreCase("positive")){
            priceForAccommodation *= 1.25;
        }else {
            priceForAccommodation *= 0.90;
        }

        System.out.printf("%.2f", priceForAccommodation);
    }
}
