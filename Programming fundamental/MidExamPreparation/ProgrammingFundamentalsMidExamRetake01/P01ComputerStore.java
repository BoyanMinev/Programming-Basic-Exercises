package MidExamPreparation.ProgrammingFundamentalsMidExamRetake01;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalPriceWithoutTax = 0;
        double totalAmountOfTax = 0;

        while(!input.equals("special") && !input.equals("regular")){
            double priceOfPart = Double.parseDouble(input);

            if (priceOfPart < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            totalPriceWithoutTax += priceOfPart;
            totalAmountOfTax += priceOfPart * 0.2;
            input = scanner.nextLine();
        }
        double totalPrice = totalPriceWithoutTax + totalAmountOfTax;
        if (input.equals("special")){
            totalPrice = totalPrice * 0.9;
        }
        if (totalPrice == 0){
            System.out.println("Invalid order!");
        }else {

            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n", totalPriceWithoutTax, totalAmountOfTax, totalPrice);
        }
    }
}
