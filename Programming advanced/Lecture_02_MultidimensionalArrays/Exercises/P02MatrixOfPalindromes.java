package Lecture_02_MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixData = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(matrixData[0]);
        int cols = Integer.parseInt(matrixData[1]);

        String[][] matrix = fillMatrix(rows, cols);

        printMatrix(matrix);


    }
    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }

    private static String[][] fillMatrix(int rows, int cols) {
        String[][] matrix = new String[rows][cols];
        int startLetter = 97;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                StringBuilder palindrome = new StringBuilder();
                palindrome.append("" + (char)(startLetter + row));
                palindrome.append("" + (char)(startLetter + row + col));
                palindrome.append("" + (char)(startLetter + row));
                matrix[row][col] = palindrome.toString();
            }
        }



return matrix;

    }
}
