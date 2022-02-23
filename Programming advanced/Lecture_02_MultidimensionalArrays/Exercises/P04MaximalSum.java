package Lecture_02_MultidimensionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixData = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixData[0]);
        int cols = Integer.parseInt(matrixData[1]);

        int[][] matrix = readMatrix(scanner, rows, cols);
        int squareMatrixSize = 3;
        int[][] squareMatrixMaxSumElements = getSquareMatrix(matrix, squareMatrixSize);
        int sumOfSquareMatrix = getSumOfSquareMatrix(squareMatrixMaxSumElements);

        System.out.println("Sum = " + sumOfSquareMatrix);
        printMatrix(squareMatrixMaxSumElements);


    }
    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }
    private static int[][] getSquareMatrix(int[][] matrix, int squareMatrixSize) {
        int[][] squareMatrix = new int[squareMatrixSize][squareMatrixSize];
       int[][] matrixWithMaxSumElements = new int[squareMatrixSize][squareMatrixSize];
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i <= matrix.length - squareMatrixSize; i++) {
            for (int j = 0; j <= matrix[i].length - squareMatrixSize; j++) {
                for (int row = i; row < squareMatrixSize + i ; row++) {
                    for (int col = j; col < squareMatrixSize + j; col++) {
                        squareMatrix[row - i][col - j] = matrix[row][col];
                    }
                }
                sum = getSumOfSquareMatrix(squareMatrix);
                if (sum > maxSum){
                    maxSum = sum;
                    matrixWithMaxSumElements = squareMatrix.clone();
                }
                squareMatrix = new int[squareMatrixSize][squareMatrixSize];

            }
        }




        return matrixWithMaxSumElements;
    }

    private static int getSumOfSquareMatrix(int[][] squareMatrix) {
        int sum = 0;

        for (int row = 0; row < squareMatrix.length; row++) {
            for (int col = 0; col < squareMatrix.length; col++) {
                sum += squareMatrix[row][col];
            }
        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scanner, int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;


    }
}
