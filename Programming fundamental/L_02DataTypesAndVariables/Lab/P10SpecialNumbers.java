package L_02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 0;



        for (int i = 1; i <= n; i++) {
            String specialNumber = "False";
            number = i;
            int sumDigit = 0;
            while (number != 0){

                int digit = number % 10;
                number /= 10;
                sumDigit += digit;
            }
            if (sumDigit == 5 || sumDigit == 7 || sumDigit == 11){
                specialNumber = "True";
            }
            System.out.printf("%d -> %s%n", i, specialNumber);
        }

    }
}
