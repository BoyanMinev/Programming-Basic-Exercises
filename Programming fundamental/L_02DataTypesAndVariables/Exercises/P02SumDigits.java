package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumDigit = 0;

        while (number != 0){

            int digit = number % 10;
            number /= 10;
            sumDigit += digit;


        }
        System.out.println(sumDigit);
    }
}
