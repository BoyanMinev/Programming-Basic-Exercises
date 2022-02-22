package Lecture_02_MultidimensionalArrays.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixData = scanner.nextLine().split(", ");

        int matrixSize = Integer.parseInt(matrixData[0]);
        String patternOfMatrix = matrixData[1];

        int[][] matrix = fillMatrix(matrixSize, patternOfMatrix);

        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }

    private static int[][] fillMatrix(int matrixSize, String patternOfMatrix) {

        int[][] matrix = new int[matrixSize][matrixSize];
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= matrixSize * matrixSize; i++) {
            numbers.add(i);
        }
        switch (patternOfMatrix) {

            case "A":
                for (int col = 0; col < matrix.length; col++) {
                    for (int row = 0; row < matrix.length; row++) {
                        matrix[row][col] = numbers.remove(0);
                    }
                }
                break;
            case "B":
                for (int col = 0; col < matrix.length; col++) {
                    if (col % 2 == 0) {
                        for (int row = 0; row < matrix.length; row++) {
                            matrix[row][col] = numbers.remove(0);
                        }
                    } else {
                        for (int row = matrix.length - 1; row >= 0; row--) {
                            matrix[row][col] = numbers.remove(0);
                        }
                    }
                }
                break;
        }
        return matrix;


    }


}

