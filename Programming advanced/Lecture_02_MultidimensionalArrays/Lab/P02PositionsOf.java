package Lecture_02_MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = readArray(scanner.nextLine());
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        int [][] matrix = readMatrix(rows, cols, scanner);
        int checkNumber = Integer.parseInt(scanner.nextLine());
        isFoundInMatrix(checkNumber, matrix);



    }

    private static void isFoundInMatrix(int checkNumber, int[][] matrix) {
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == checkNumber){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }

        }

        if (!isFound){
            System.out.println("not found");
        }

    }

    public static int[] readArray(String input) {

        return Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
    public static int[][] readMatrix(int rows, int cols, Scanner scanner){
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] array = readArray(scanner.nextLine());
            matrix[i] = array;
        }
        return matrix;
    }
}
