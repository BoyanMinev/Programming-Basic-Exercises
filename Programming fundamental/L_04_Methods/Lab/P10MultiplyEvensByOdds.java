package L_04_Methods.Lab;

import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = multiply(number);
        System.out.println(result);
    }

    private static int multiply(int number) {
        return Math.abs(sumEvenDigits(number) * sumOddDigit(number));
    }

    private static int sumOddDigit(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = 0;
            digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    private static int sumEvenDigits(int number) {

        int sum = 0;
        while (number != 0) {
            int digit = 0;
            digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
