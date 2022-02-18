package Lecture_02_MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAdnCols = readArray(scanner.nextLine());
        int rows = rowsAdnCols[0];
        int cols = rowsAdnCols[1];

        int[][] firstMatrix = readMatrix(rows,cols,scanner);

        rowsAdnCols = readArray(scanner.nextLine());
        rows = rowsAdnCols[0];
        cols = rowsAdnCols[1];

        int[][] secondMatrix = readMatrix(rows, cols, scanner);

        if (isEqualMatrices(firstMatrix, secondMatrix)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }

    private static boolean isEqualMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length){
            return false;
        }

        for (int row = 0; row < firstMatrix.length; row++) {
           if (firstMatrix[row].length != secondMatrix[row].length) {
               return false;
           }
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]){
                    return false;
                }
            }
        }

        return true;
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

