package P06NestedLoops.Lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int finishInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int countCombinations = 0;
        int combinationOfResult = 0;
        int a = 0;
        int b = 0;
        boolean isFound = false;
        label:
        for (int i = startInterval; i <= finishInterval; i++) {
            for (int j = startInterval; j <= finishInterval; j++) {
                int sum = i + j;

                countCombinations++;
                if (sum == magicNumber){
                    combinationOfResult = countCombinations;
                    a = i;
                    b = j;
                    isFound = true;
                    break label;
                }

            }

        }if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", combinationOfResult, a, b, magicNumber);
        }else{
            System.out.printf("%d combinations - neither equals %d", countCombinations, magicNumber);
        }
    }
}
