package L04ForLoop.Lab;

import java.util.Scanner;

public class P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <=n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0){
                oddSum += number;
            }
            else{
                evenSum += number;

            }

        }
        if (evenSum == oddSum){
            System.out.printf("Yes\n" +
                    "Sum = %d", evenSum);
        }else{
            int diff = Math.abs(evenSum - oddSum);
            System.out.printf("No\n" +
                    "Diff = %d", diff);
        }
    }
}
