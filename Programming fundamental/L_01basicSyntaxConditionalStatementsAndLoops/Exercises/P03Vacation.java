package L_01basicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeopleInGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double priceForAccommodation = 0;

        //	        Friday	Saturday	Sunday
        //Students	8.45	 9.80	    10.46
        //Business	10.90	 15.60	      16
        //Regular	15	      20	    22.50

        if (dayOfTheWeek.equalsIgnoreCase("Friday")){
            switch (typeOfGroup){
                case "Students":
                    priceForAccommodation = 8.45 * numOfPeopleInGroup;
                   break;
                case "Business":
                    priceForAccommodation = 10.90 * numOfPeopleInGroup;
                    break;
                case "Regular":
                    priceForAccommodation = 15 * numOfPeopleInGroup;
                    break;

            }
        }else if (dayOfTheWeek.equalsIgnoreCase("Saturday")){
            switch (typeOfGroup){
                case "Students":
                    priceForAccommodation = 9.80 * numOfPeopleInGroup;
                    break;
                case "Business":
                    priceForAccommodation = 15.60 * numOfPeopleInGroup;
                    break;
                case "Regular":
                    priceForAccommodation = 20 * numOfPeopleInGroup;
                    break;

            }
        }else if (dayOfTheWeek.equalsIgnoreCase("Sunday")){
            switch (typeOfGroup){
                case "Students":
                    priceForAccommodation = 10.46 * numOfPeopleInGroup;
                    break;
                case "Business":
                    priceForAccommodation = 16 * numOfPeopleInGroup;
                    break;
                case "Regular":
                    priceForAccommodation = 22.50 * numOfPeopleInGroup;
                    break;

            }
        }
        if (typeOfGroup.equalsIgnoreCase("Students") && numOfPeopleInGroup >= 30){
            priceForAccommodation *= 0.85;
        }if (typeOfGroup.equalsIgnoreCase("Business") && numOfPeopleInGroup >= 100){
            priceForAccommodation = (priceForAccommodation / numOfPeopleInGroup) * (numOfPeopleInGroup - 10);
        }if (typeOfGroup.equalsIgnoreCase("Regular") && numOfPeopleInGroup >= 10 && numOfPeopleInGroup <= 20){
            priceForAccommodation *= 0.95;
        }
        System.out.printf("Total price: %.2f", priceForAccommodation);
    }
}
