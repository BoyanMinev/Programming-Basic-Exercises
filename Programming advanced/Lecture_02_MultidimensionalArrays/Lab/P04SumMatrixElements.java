package Lecture_02_MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pattern = ", ";
        String[] sizeOfMatrix = scanner.nextLine().split(pattern);
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int cols = Integer.parseInt(sizeOfMatrix[1]);
       int sumOfAllElementOfMatrix = readMatrix(rows, cols, scanner, pattern);

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sumOfAllElementOfMatrix);
    }

    private static int readMatrix(int rows, int cols, Scanner scanner, String pattern) {

        int sum = 0;
        for (int row = 0; row < rows; row++) {
            int[] array = readArray(scanner.nextLine(),pattern);
            for (int col = 0; col < array.length; col++) {
                sum += array[col];

            }
        }

        return sum;
    }
    public static int[] readArray(String input, String pattern) {

        return Arrays.stream(input.split(pattern))
                .mapToInt(Integer::parseInt).toArray();
    }
}
