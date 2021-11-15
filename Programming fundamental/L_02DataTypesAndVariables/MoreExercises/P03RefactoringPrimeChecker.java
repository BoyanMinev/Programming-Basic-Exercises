package L_02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class P03RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        for (int digit = 2; digit <= N; digit++) {
            boolean isPrime = true;
            for (int divideDigit = 2; divideDigit < digit; divideDigit++) {
                if (digit % divideDigit == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", digit, isPrime);
        }

    }
}
