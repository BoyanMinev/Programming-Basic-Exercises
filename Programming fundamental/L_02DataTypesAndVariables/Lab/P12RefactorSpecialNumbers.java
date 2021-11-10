package L_02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        for (int i = 1; i <= n; i++) {
            String isSpecialNumber = "False";
            int sumDigit = 0;
            int number = i;
            while (number > 0) {
                digit = number % 10;
                number = number / 10;
                sumDigit += digit;
            }
             if (sumDigit == 5 || sumDigit == 7 || sumDigit == 11){
                 isSpecialNumber = "True";
             }
            System.out.printf("%d -> %s%n", i, isSpecialNumber);


        }

    }
}
