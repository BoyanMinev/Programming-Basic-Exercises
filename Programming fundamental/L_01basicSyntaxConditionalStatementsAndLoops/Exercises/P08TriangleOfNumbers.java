package L_01basicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P08TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            for (int j = i; j > 0 ; j--) {

                System.out.printf("%d ", i);
            }
            System.out.println();

        }
    }
}
