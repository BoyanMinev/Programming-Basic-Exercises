package L_04_Methods.Exercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.2f", divideFactorialOfEachNumber(firstNumber, secondNumber));

    }

    private static double divideFactorialOfEachNumber(int firstNumber, int secondNumber) {

        return factorialFirstNumber(firstNumber) / factorialSecondNumber(secondNumber);
    }

    private static double factorialFirstNumber(int firstNumber) {
        double result = firstNumber;
        for (int i = 1; i <= firstNumber - 1; i++) {
            result *= (firstNumber - i);
        }
        return result;
    }

    private static double factorialSecondNumber(int secondNumber) {
        double result = secondNumber;
        for (int i = 1; i <= secondNumber - 1; i++) {
            result *= (result - i);
        }
        return result;
    }
}
