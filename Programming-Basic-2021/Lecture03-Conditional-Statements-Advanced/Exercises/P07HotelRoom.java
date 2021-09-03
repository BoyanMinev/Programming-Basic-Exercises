package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String months = scanner.nextLine();
        int numAccommodation = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;
        double discount = 0.0;

        if (months.equalsIgnoreCase("May") || months.equalsIgnoreCase("October")){
            priceStudio = 50 * numAccommodation;
            priceApartment = 65 * numAccommodation;
            if (numAccommodation > 7 && numAccommodation <= 14){
                priceStudio = (50 * numAccommodation) - ((50 * numAccommodation) * 0.05);

            }
            else if (numAccommodation > 14){
                priceStudio = (50 * numAccommodation) - ((50 * numAccommodation) * 0.3);
                priceApartment = (65 * numAccommodation) - ((65 * numAccommodation) * 0.1);
            }
        }
        else if (months.equalsIgnoreCase("June") || months.equalsIgnoreCase("September")){
            priceStudio = 75.20 * numAccommodation;
            priceApartment = 68.70 * numAccommodation;
            if (numAccommodation > 14){
                priceStudio = (75.20 * numAccommodation) - ((75.20 * numAccommodation) * 0.2);
                priceApartment = (68.70 * numAccommodation) - ((68.70 * numAccommodation) * 0.1);
            }
        }
        else if(months.equalsIgnoreCase("July") || months.equalsIgnoreCase("August")){
            priceStudio = 76 * numAccommodation;
            priceApartment = 77 * numAccommodation;
            if (numAccommodation > 14){
                priceApartment = (77 * numAccommodation) - ((77 * numAccommodation) * 0.1);
            }
        }
        System.out.printf("Apartment: %.2f lv.%n" +
                "Studio: %.2f lv.", priceApartment, priceStudio);
    }
}
