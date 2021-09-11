package L04ForLoop.Exercises;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int diff = 0;
        int sumWithoutMax = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;


            if (number > max) {
                max = number;

            }
            sumWithoutMax = sum - max;
        }
        if (sumWithoutMax == max) {
            System.out.printf("Yes\n" +
                    "Sum = %d", sumWithoutMax);
        } else {
            diff = Math.abs(sumWithoutMax - max);
            System.out.printf("No\n" +
                    "Diff = %d", diff);
        }

    }
}