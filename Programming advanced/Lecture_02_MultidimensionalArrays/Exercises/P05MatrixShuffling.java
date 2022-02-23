package Lecture_02_MultidimensionalArrays.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixData = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixData[0]);
        int cols = Integer.parseInt(matrixData[1]);
       List<List<String>> matrix = readMatrix(scanner, rows, cols);

        String input = scanner.nextLine();

        while (!input.equals("END")){

            String[] commandData = input.split("\\s+");

            if (isValidCommandData(commandData, matrix, rows,cols)){

                int row1 = Integer.parseInt(commandData[1]);
                int row2 = Integer.parseInt(commandData[3]);
                int col1 = Integer.parseInt(commandData[2]);
                int col2 = Integer.parseInt(commandData[4]);

                String elementToMove = matrix.get(row1).get(col1);
                matrix.get(row1).set(col1, matrix.get(row2).get(col2));
                matrix.get(row2).set(col2, elementToMove);

                printMatrix(matrix);
            }else {
                System.out.println("Invalid input!");
            }


            input = scanner.nextLine();
        }
    }

    private static void printMatrix(List<List<String>> matrix) {

        for (int row = 0; row < matrix.size(); row++) {
            System.out.println(String.join(" ", matrix.get(row)));
        }



    }

    private static boolean isValidCommandData(String[] commandData, List<List<String>> matrix, int rows, int cols) {
        if (!commandData[0].equals("swap")){
            return false;
        }
        if(commandData.length != 5){
            return false;
        }
        int row1 = Integer.parseInt(commandData[1]);
        int row2 = Integer.parseInt(commandData[3]);
        int col1 = Integer.parseInt(commandData[2]);
        int col2 = Integer.parseInt(commandData[4]);

        if (row1 < 0 || row1 > matrix.size() - 1 || row2 < 0 || row2 > matrix.size() - 1 || col1 < 0 || col1 > cols - 1 || col2 < 0 || col2 > cols - 1){
            return false;
        }

        return true;
    }

    private static List readMatrix(Scanner scanner, int rows, int cols) {
        List<List<String>> matrix = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            String[] elementsData = scanner.nextLine().split(" ");
            List<String> elements = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                elements.add(elementsData[col]);
            }
            matrix.add(elements);
        }
        return matrix;


    }
}
