package Lecture_02_MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String pattern = " ";
        int[][] matrix = readMatrix(rows, 0,scanner, pattern);
        int wrongValue = matrix[scanner.nextInt()][scanner.nextInt()];
        int[][] fixedMatrix = fixedWrongValueOfMatrix(matrix, wrongValue);

        printMatrix(fixedMatrix);



    }
    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fixedWrongValueOfMatrix(int[][] matrix, int wrongValue) {
        int cols = 0;
        int[][] fixedMatrix = new int[matrix.length][];

        for (int row = 0; row < matrix.length; row++) {
            int[] array = new int[matrix[row].length];
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue){
                    int sumOfElementsAround = 0;
                    if (row > 0){
                        if (matrix[row - 1][col] != wrongValue) {
                            sumOfElementsAround += matrix[row - 1][col];
                        }
                    }
                    if (row < matrix.length - 1){
                        if (matrix[row + 1][col] != wrongValue) {
                            sumOfElementsAround += matrix[row + 1][col];
                        }
                    }
                    if (col < matrix[row].length - 1){
                        if (matrix[row][col + 1] != wrongValue) {
                            sumOfElementsAround += matrix[row][col + 1];
                        }
                    }
                    if (col > 0){
                        if (matrix[row][col - 1] != wrongValue) {
                            sumOfElementsAround += matrix[row][col - 1];
                        }
                    }
                    array[col] = sumOfElementsAround;
                }else {
                    array[col] = matrix[row][col];

                }


            }
            fixedMatrix[row] = array;


        }



        return fixedMatrix;
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
}
