package L04ForLoop.MoreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalPriceElectricity = 0.0;


        for (int i = 0; i < n; i++) {

            double priceElectricity = Double.parseDouble(scanner.nextLine());

            totalPriceElectricity += priceElectricity;

        }
        double watterBill = 20 * n;
        double internetBill = 15 * n;
        double otherBills = (totalPriceElectricity + watterBill + internetBill) + (totalPriceElectricity + internetBill + watterBill ) * 0.2 ;
        double averageBillsForMonths = (internetBill + watterBill + totalPriceElectricity + otherBills) / n;

        System.out.printf("Electricity: %.2f lv\n" +
                "Water: %.2f lv\n" +
                "Internet: %.2f lv\n" +
                "Other: %.2f lv\n" +
                "Average: %.2f lv", totalPriceElectricity, watterBill, internetBill, otherBills, averageBillsForMonths);
    }
}
