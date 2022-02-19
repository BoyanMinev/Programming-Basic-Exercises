package Lecture_02_MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        String pattern = " ";
        int[][] matrix = readMatrix(sizeMatrix, sizeMatrix, scanner, pattern);
        int[][] matrixOfDiagonals = getDiagonalsOfMatrix(matrix);

        printMatrix(matrixOfDiagonals);


    }

    private static int[][] getDiagonalsOfMatrix(int[][] matrix) {
        int[][] matrixOfDiagonals = new int[2][matrix.length];
        int[] diagonals = new int[matrix.length];


            for (int i = 0; i < matrix.length; i++) {
                diagonals[i] = matrix[i][i];
            }
            matrixOfDiagonals[0] = diagonals;

        diagonals = new int[matrix.length];

            for (int i = 0; i < matrix.length; i++) {
                diagonals[i] = matrix[matrix.length - 1 - i][i];
            }
            matrixOfDiagonals[1] = diagonals;

        return matrixOfDiagonals;



    }

    public static int[][] readMatrix(int rows, int cols, Scanner scanner, String pattern){
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] array = readArray(scanner.nextLine(), pattern);
            matrix[i] = array;
        }
        return matrix;
    }
    public static int[] readArray(String input, String pattern) {

        return Arrays.stream(input.split(pattern))
                .mapToInt(Integer::parseInt).toArray();
    }
    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
