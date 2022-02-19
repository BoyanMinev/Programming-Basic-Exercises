package Lecture_02_MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05MaximumSumOf2x2SubMatrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = ", ";
       int[] rowsAndCols = readArray(scanner.nextLine(), pattern);
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int [][] matrix = readMatrix(rows, cols, scanner, pattern);
        findBiggestSumOf2x2SubMatrixOfMatrix(matrix, rows, cols);
    }

    private static void findBiggestSumOf2x2SubMatrixOfMatrix(int[][] matrix, int rows, int cols) {
        int maxSum = Integer.MIN_VALUE;
        int sumOfSubMatrix = 0;
        int currentCol =0;
        int[][] matrixWithMaxSumOfElement = new int[2][2];
        int[][] subMatrix = new int[2][2];
        for (int row = 0; row < rows - 1.; row++) {
            for (int col = 0; col < cols - 1; col++) {
                subMatrix = getSubMatrix(matrix, row, col);
                sumOfSubMatrix = getSumOfSubMatrix(subMatrix);
                if (sumOfSubMatrix > maxSum){
                    maxSum = sumOfSubMatrix;
                    matrixWithMaxSumOfElement = subMatrix.clone();
                }

            }
        }
            printMatrix(matrixWithMaxSumOfElement);
        System.out.println(maxSum);
            }

    private static int getSumOfSubMatrix(int[][] subMatrix) {
        int sum = 0;

        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                sum += subMatrix[row][col];
            }
        }
        return sum;
    }



    public static int[][] getSubMatrix(int [][] matrix, int row, int col){
    int [][] subMatrix = new int[2][2];
        subMatrix[0][0] = matrix[row][col];
        subMatrix[0][1] = matrix[row][col + 1];
        subMatrix[1][0] = matrix[row + 1][col];
        subMatrix[1][1] = matrix[row + 1][col + 1];
        return subMatrix;
    }
    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    private static int sumOfMatrix(int[][] subMatrix) {
        int sum = 0;

        for (int row = 0; row < subMatrix.length; row++) {
            for (int col = 0; col < subMatrix[row].length; col++) {
                sum += subMatrix[row][col];
            }
        }

        return  sum;

    }

    public static int[] readArray(String input, String pattern) {

        return Arrays.stream(input.split(pattern))
                .mapToInt(Integer::parseInt).toArray();
    }
    public static int[][] readMatrix(int rows, int cols, Scanner scanner, String pattern){
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] array = readArray(scanner.nextLine(), pattern);
            matrix[i] = array;
        }
        return matrix;
    }
}
