package L_01basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n ; i++) {

            int oddNumber = i * 2 - 1;

            System.out.println(oddNumber);

            sum += oddNumber;

        }
        System.out.println("Sum:" + " " + sum);
    }
}
