package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalAmount = 0;
        int countWorkingDays = 0;
        int consumeSpiceFromWorkers = 26;

        while(startingYield >= 100){

            totalAmount += startingYield;
            countWorkingDays ++;
            totalAmount -= consumeSpiceFromWorkers;


            startingYield -= 10;
        }
        if (totalAmount > consumeSpiceFromWorkers) {
            totalAmount -= consumeSpiceFromWorkers;
        }
        System.out.printf("%d%n" +
                "%d", countWorkingDays, totalAmount);
    }
}
