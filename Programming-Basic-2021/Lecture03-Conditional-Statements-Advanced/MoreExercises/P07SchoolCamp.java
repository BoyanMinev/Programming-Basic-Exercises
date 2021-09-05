package L03ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeOfGroup = scanner.nextLine();
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        int numOfAccommodation = Integer.parseInt(scanner.nextLine());


        String typeOfSport = "";
        double priceWithoutDiscount = 0.0;
        double priceOfAccommodations = 0.0;

        if (season.equalsIgnoreCase("Winter")) {
            switch (typeOfGroup) {
                case "boys":
                    typeOfSport = "Judo";
                    priceWithoutDiscount = 9.60 * numOfAccommodation * numOfStudents;
                    ;
                    break;
                case "girls":
                    typeOfSport = "Gymnastics";
                    priceWithoutDiscount = 9.60 * numOfAccommodation * numOfStudents;
                    break;
                case "mixed":
                    typeOfSport = "Ski";
                    priceWithoutDiscount = 10 * numOfAccommodation * numOfStudents;
                    break;

            }
        } else if (season.equalsIgnoreCase("Spring")) {
            switch (typeOfGroup) {
                case "boys":
                    typeOfSport = "Tennis";
                    priceWithoutDiscount = 7.20 * numOfAccommodation * numOfStudents;
                    break;
                case "girls":
                    typeOfSport = "Athletics";
                    priceWithoutDiscount = 7.20 * numOfAccommodation * numOfStudents;
                    break;
                case "mixed":
                    typeOfSport = "Cycling";
                    priceWithoutDiscount = 9.50 * numOfAccommodation * numOfStudents;
                    break;
            }
        } else if (season.equalsIgnoreCase("Summer")) {
            switch (typeOfGroup) {
                case "boys":
                    typeOfSport = "Football";
                    priceWithoutDiscount = 15 * numOfAccommodation * numOfStudents;
                    break;
                case "girls":
                    typeOfSport = "Volleyball";
                    priceWithoutDiscount = 15 * numOfAccommodation * numOfStudents;
                    break;
                case "mixed":
                    typeOfSport = "Swimming";
                    priceWithoutDiscount = 20 * numOfAccommodation * numOfStudents;
                    break;
            }
        }
        if (numOfStudents < 20 && numOfStudents >= 10) {

            priceOfAccommodations = priceWithoutDiscount - (priceWithoutDiscount * 0.05);
        } else if (numOfStudents < 50 && numOfStudents >= 20) {
            priceOfAccommodations = priceWithoutDiscount - (priceWithoutDiscount * 0.15);

        } else if (numOfStudents >= 50) {
            priceOfAccommodations = priceWithoutDiscount - (priceWithoutDiscount * 0.50);

        }
        else{
            priceOfAccommodations = priceWithoutDiscount;
        }
        System.out.printf("%s %.2f lv.",typeOfSport, priceOfAccommodations);
    }
}