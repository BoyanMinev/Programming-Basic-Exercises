package L_04_Methods.Lab;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printTriangle(number);
    }

    private static void printTriangle(int number) {
        printFirstHalf(number);
        printSecondHalf(number);
    }

    private static void printFirstHalf(int number) {
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= i  ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void printSecondHalf(int number) {
        for (int i = number - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
