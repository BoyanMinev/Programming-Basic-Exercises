package L04ForLoop.Lab;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }

        }
        System.out.printf("Max number: %d\n" +
                "Min number: %d\n", max, min);
    }
}
