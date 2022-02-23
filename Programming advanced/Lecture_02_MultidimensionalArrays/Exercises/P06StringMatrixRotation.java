package Lecture_02_MultidimensionalArrays.Exercises;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;



public class P06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputDegree = scanner.nextLine().split("[()]");

        int degreeOfRotation = Integer.parseInt(inputDegree[1]);
        List<String> listTextInputs = new ArrayList<>();

        String textInput = scanner.nextLine();
        while (!textInput.equals("END")){
         listTextInputs.add(textInput);
            textInput = scanner.nextLine();
        }
        int maxLengthString = Integer.MIN_VALUE;
        for (int i = 0; i < listTextInputs.size(); i++) {
            if (listTextInputs.get(i).length() > maxLengthString){
                maxLengthString = listTextInputs.get(i).length();
            }

        }
        if ((degreeOfRotation / 90) % 4 == 1){
            char[][] matrix = readMatrix90(listTextInputs, maxLengthString);
            printMatrix(matrix);
        }else if ((degreeOfRotation / 90) % 4 == 2){
            char[][] matrix = readMatrix180(listTextInputs, maxLengthString);
            printMatrix(matrix);
        }else if ((degreeOfRotation / 90) % 4 == 3){
            char[][] matrix = readMatrix270(listTextInputs, maxLengthString);
            printMatrix(matrix);
        }else if ((degreeOfRotation / 90) % 4 == 0){
            char[][] matrix = readMatrix360(listTextInputs, maxLengthString);
            printMatrix(matrix);
        }



    }

    private static char[][] readMatrix270(List<String> listTextInputs, int maxLengthString) {
        char[][] matrix = new char[maxLengthString][listTextInputs.size()];

        for (int col = 0; col < listTextInputs.size() ; col++) {
            for (int row = maxLengthString - 1; row >= maxLengthString - listTextInputs.get(col).length() ; row--) {
                matrix[row][col] = listTextInputs.get(col).charAt(maxLengthString - 1 - row);
                if (maxLengthString - 1 - row == listTextInputs.get(col).length() - 1){
                    break;
                }
            }
        }
        return matrix;
    }

    private static char[][] readMatrix180(List<String> listTextInputs, int maxLengthString) {
        char[][] matrix = new char[listTextInputs.size()][maxLengthString];

        for (int row = 0; row < matrix.length; row++) {

            for (int col = maxLengthString - 1; col >= 0 ; col--) {
                matrix[row][col] = listTextInputs.get(listTextInputs.size() - 1 - row).charAt(maxLengthString - 1 - col);
                        if(maxLengthString - 1 - col  == listTextInputs.get(listTextInputs.size() - 1 - row).length() - 1){
                            break;
                        }
            }
        }
        return matrix;
    }

    private static char[][] readMatrix90(List<String> listTextInputs, int maxLengthString) {
        char[][] matrix = new char[maxLengthString][listTextInputs.size()];


        for (int col = listTextInputs.size() - 1; col >= 0; col--) {
            for (int row = 0; row < listTextInputs.get(listTextInputs.size() - 1 - col).length(); row++) {
                matrix[row][col] = listTextInputs.get(listTextInputs.size() - 1 - col).charAt(row);
            }
        }



        return matrix;
    }

    private static void printMatrix(char[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0){
                    System.out.print(" ");
                }else {
                    System.out.print(matrix[row][col]);
                }
            }
            System.out.println();
        }



    }

    private static char[][] readMatrix360(List<String> listTextInputs, int maxLengthString) {
        char[][] matrix = new char[listTextInputs.size()][maxLengthString];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < listTextInputs.get(row).length(); col++) {
                matrix[row][col] = listTextInputs.get(row).charAt(col);
            }
        }
        return matrix;

    }
}
