package Lecture_02_MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(scanner, matrixSize);

        int sumOfPrimaryDiagonal = getPrimaryDiagonalSum(matrix);

        int sumOfSecondaryDiagonal = getSecondaryDiagonalSum(matrix);

        int absoluteDiff = Math.abs(sumOfPrimaryDiagonal - sumOfSecondaryDiagonal);

        System.out.println(absoluteDiff);
    }

    private static int getSecondaryDiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ((row + col) == (matrix.length - 1)){
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }

    private static int getPrimaryDiagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scanner, int matrixSize) {
        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;


    }
}
