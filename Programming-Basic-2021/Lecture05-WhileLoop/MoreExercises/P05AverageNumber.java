package L05WhileLoop.MoreExercises;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int sumNumbers = 0;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            sumNumbers += number;


        }
        double average = 1.0 * sumNumbers / n;

        System.out.printf("%.2f", average);
    }
}
