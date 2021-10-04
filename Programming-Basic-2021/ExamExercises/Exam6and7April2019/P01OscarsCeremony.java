package ExamExercises.Exam6and7April2019;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rentHall = Integer.parseInt(scanner.nextLine());



       double priceStatuette = rentHall - (rentHall * 0.3);
        double priceCatering = priceStatuette - (priceStatuette * 0.15);
       double priceSound = priceCatering / 2;

        double totalExpenses = priceCatering + priceSound + priceStatuette + rentHall;

        System.out.printf("%.2f", totalExpenses);
    }
}
