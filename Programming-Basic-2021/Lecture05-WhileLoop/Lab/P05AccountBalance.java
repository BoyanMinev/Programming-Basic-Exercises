package L05WhileLoop.Lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalSum = 0.0;

        while(!input.equals("NoMoreMoney")){
            double number = Double.parseDouble(input);
            if (number < 0){
                System.out.println("Invalid operation!");
                break;
            }
            totalSum += number;
            System.out.printf("Increase: %.2f%n", number);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalSum);
    }
}
