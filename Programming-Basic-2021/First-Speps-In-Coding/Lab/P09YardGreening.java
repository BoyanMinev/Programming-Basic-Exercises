package L01FirstSpepsInCoding.Lab;

import java.util.Scanner;

public class P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaOfYard = Double.parseDouble(scanner.nextLine());

        double priceForJob = areaOfYard * 7.61;
        double discount = priceForJob * 0.18;
        double totalPrice = priceForJob - discount;

        System.out.printf("The final price is: %.2f lv.%n" +
                "The discount is: %.2f lv.", totalPrice, discount);

    }
}
