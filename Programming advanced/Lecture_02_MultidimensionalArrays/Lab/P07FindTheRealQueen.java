package Lecture_02_MultidimensionalArrays.Lab;

import java.util.Scanner;

public class P07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] chessBoardMatrix = readMatrix(8,8,scanner);
        char queenSymbol = 'q';

        int[] coordinatesOfValidQueen = getCoordinatesOfValidQueen(chessBoardMatrix, queenSymbol);

        for (Integer coordinateNumber:coordinatesOfValidQueen) {

            System.out.print(coordinateNumber + " ");

        }

    }

    private static int[] getCoordinatesOfValidQueen(char[][] chessBoardMatrix, char queenSymbol) {
        int[] coordinatesOfValidQueen = new int[2];
        for (int row = 0; row < chessBoardMatrix.length; row++) {
            for (int col = 0; col < chessBoardMatrix[row].length; col++) {
                if (chessBoardMatrix[row][col] == queenSymbol){
                    boolean isFoundAnotherQueenOnHerWays = false;

                    // check down direction
                    for (int i = row + 1; i <chessBoardMatrix.length ; i++) {
                        if (chessBoardMatrix[i][col] == queenSymbol) {
                            isFoundAnotherQueenOnHerWays = true;
                            break;
                        }
                    }
                    // check up direction
                    for (int i = 0; i < row ; i++) {
                        if (chessBoardMatrix[i][col] == queenSymbol){
                            isFoundAnotherQueenOnHerWays = true;
                            break;
                        }
                    }
                    // check left direction
                    for (int i = 0; i < col; i++) {
                        if (chessBoardMatrix[row][i] == queenSymbol){
                            isFoundAnotherQueenOnHerWays = true;
                            break;
                        }
                    }
                    // check right direction
                    for (int i = col + 1; i < chessBoardMatrix[row].length; i++) {
                        if (chessBoardMatrix[row][i] == queenSymbol){
                            isFoundAnotherQueenOnHerWays = true;
                            break;
                        }
                    }
                    // check firstDiagonals

                    int count = 0;
                    if (row >= chessBoardMatrix.length - 1 - col) {

                       if (col < chessBoardMatrix.length - 1) {
                           for (int i = col + 1; i <= chessBoardMatrix.length - 1; i++) {
                               count++;
                               if (chessBoardMatrix[row - count][i] == queenSymbol) {
                                   isFoundAnotherQueenOnHerWays = true;
                                   break;
                               }
                           }
                       }
                        count = 0;
                       if (row < chessBoardMatrix.length - 1) {
                           for (int i = row + 1; i <= chessBoardMatrix.length - 1; i++) {
                               count++;
                               if (chessBoardMatrix[i][col - count] == queenSymbol) {
                                   isFoundAnotherQueenOnHerWays = true;
                                   break;
                               }
                           }
                       }

                    }else {

                       if (row > 0) {
                           for (int i = row - 1; i >= 0; i--) {
                               count++;
                               if (chessBoardMatrix[i][col + count] == queenSymbol) {
                                   isFoundAnotherQueenOnHerWays = true;
                                   break;
                               }
                           }
                       }
                        count = 0;
                        for (int i = col - 1 ; i >= 0 ; i--) {
                            count ++;
                            if (chessBoardMatrix [row + count][i] == queenSymbol){
                                isFoundAnotherQueenOnHerWays = true;
                                break;
                            }
                        }

                    }
                    // check second diagonal
                    if (row <= col){

                        count = 0;
                        if(row > 0) {
                            for (int i = row - 1; i >= 0; i--) {
                                count ++;
                                if (chessBoardMatrix[i][col - count] == queenSymbol){
                                    isFoundAnotherQueenOnHerWays = true;
                                    break;
                                }
                            }
                        }
                        count = 0;
                        if (col < chessBoardMatrix.length - 1) {
                            for (int i = col + 1; i <= chessBoardMatrix.length - 1; i++) {
                                count++;
                                if (chessBoardMatrix[row + count][i] == queenSymbol) {
                                    isFoundAnotherQueenOnHerWays = true;
                                    break;
                                }
                            }
                        }



                    }else {

                        if (col > 0){

                            count = 0;
                            for (int i = col - 1; i >= 0 ; i--) {
                                count ++;
                                if (chessBoardMatrix[row - count][i] == queenSymbol){
                                    isFoundAnotherQueenOnHerWays = true;
                                    break;
                                }
                            }

                        }
                        count = 0;
                        if (row < chessBoardMatrix.length - 1) {
                            for (int i = row + 1; i < chessBoardMatrix.length - 1; i++) {
                                count++;
                                if (chessBoardMatrix[i][col + count] == queenSymbol) {
                                    isFoundAnotherQueenOnHerWays = true;
                                    break;
                                }
                            }
                        }


                    }



                    if (!isFoundAnotherQueenOnHerWays){
                        coordinatesOfValidQueen[0] = row;
                        coordinatesOfValidQueen[1] = col;


                    }
                }

            }


        }

        return coordinatesOfValidQueen;

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
