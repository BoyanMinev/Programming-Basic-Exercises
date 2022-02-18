package Lecture_02_MultidimensionalArrays.Lab;

import java.util.Scanner;

public class P03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix = readMatrix(rows, cols, scanner);
       char[][] intersectionMatrix = intersectionOfMatrix(firstMatrix, secondMatrix, cols);
       printMatrix(intersectionMatrix);


    }

    private static char[][] intersectionOfMatrix(char[][] firstMatrix, char[][] secondMatrix, int cols) {
        char[][] intersectionMatrix = new char[firstMatrix.length][];
        for (int row = 0; row < firstMatrix.length; row++) {
            char[] array = new char[cols];
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]){
                    array[col] = firstMatrix[row][col];
                }else {
                   array[col] = '*';
                }
            }
            intersectionMatrix[row] = array;
        }
        return intersectionMatrix;



    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }



    }

    private static char[][] readMatrix(int rows, int cols, Scanner scanner) {

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] symbols = scanner.nextLine().split("\\s+");
            char[] array = new char[cols];
            for (int col = 0; col < symbols.length; col++) {
                array[col] = symbols[col].charAt(0);
            }
            matrix[row] = array;
        }
        return matrix;


    }
}
