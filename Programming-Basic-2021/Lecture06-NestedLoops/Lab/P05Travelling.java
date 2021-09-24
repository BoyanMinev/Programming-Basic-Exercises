package P06NestedLoops.Lab;

import java.util.Scanner;

public class P05Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")){

            double neededBudget = Double.parseDouble(scanner.nextLine());
            double currentBudget = 0.0;

            while (currentBudget < neededBudget){

                double saveMoney = Double.parseDouble(scanner.nextLine());

                currentBudget += saveMoney;

            }
            System.out.printf("Going to %s!%n", input);

            input = scanner.nextLine();
        }
    }
}
