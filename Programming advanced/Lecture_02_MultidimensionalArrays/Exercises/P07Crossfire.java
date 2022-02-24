package Lecture_02_MultidimensionalArrays.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P07Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] matrixData = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(matrixData[0]);
        int cols = Integer.parseInt(matrixData[1]);

        List<List<Integer>> matrix = fillMatrix(rows, cols);
        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            int[] coordinatesData = Arrays.stream(command.split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int rowTarget = coordinatesData[0];
            int colTarget = coordinatesData[1];
            int rangeToDestroy = coordinatesData[2];

            if (rowTarget >= 0 && rowTarget < rows && colTarget >= 0 && colTarget < cols){
                matrix = destroyElementsOfMatrix(matrix, rowTarget, colTarget, rangeToDestroy);
            }

            matrix.removeIf(List::isEmpty);

            command = scanner.nextLine();
        }
        printMatrix(matrix);




    }

    private static List<List<Integer>> destroyElementsOfMatrix(List<List<Integer>> matrix, int rowTarget, int colTarget, int rangeToDestroy) {
        if (matrix.size() > 0) {
            for (int currentRow = rowTarget - rangeToDestroy; currentRow <= rowTarget + rangeToDestroy ; currentRow++) {
                if (currentRow >= 0 && currentRow < matrix.size()){
                    if (matrix.get(currentRow).size() - 1 >= colTarget && colTarget >= 0){
                        matrix.get(currentRow).remove(colTarget);
                    }
                }
            }
            int correctionIndex = 0;
            for (int currentCol = colTarget - rangeToDestroy; currentCol < colTarget + rangeToDestroy - correctionIndex ; currentCol++) {

                if (matrix.size() > 0) {
                   if (rowTarget >= 0 && rowTarget < matrix.size()) {
                       if (currentCol >= 0 && currentCol < matrix.get(rowTarget).size()){
                           matrix.get(rowTarget).remove(currentCol);
                           currentCol -= 1;
                           correctionIndex -= 1;
                       }
                   }
                }
            }


        }





        return matrix;




    }

    private static void printMatrix(List<List<Integer>> matrix) {

        for (List<Integer> numbers: matrix) {
            for (Integer number: numbers) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    private static  List<List<Integer>> fillMatrix(int rows, int cols) {
        List<List<Integer>> matrix = new ArrayList<>();
        int n = cols;
        for (int row = 0; row < rows; row++) {
                List<Integer> numbers = new ArrayList<>();
                for (int col = 0; col < cols ; col++) {
                    numbers.add(row * n + col + 1 );
                }
                matrix.add(numbers);
        }


        return matrix;
    }
}
