package Lecture_02_MultidimensionalArrays.Exercises;

import java.util.Scanner;

public class P08TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double damageForEachTurnOfHeigan = Double.parseDouble(scanner.nextLine());
        double playerHealthPoints = 18500;
        double healthPointsOfHeigan = 3000000;
        String inputSpell = scanner.nextLine();
        double[][] matrix = new double [15][15];
        int numberOfPlayer = 10;
        //starting point of player is exactly in the center
        matrix[7][7] = numberOfPlayer;
        int playerRow = 7;
        int playerCol = 7;
        String typeOfKill = "";
        boolean killedPlayer = false;
        boolean isInPlagueCloud = false;

        label:
        while (playerHealthPoints > 0 || healthPointsOfHeigan > 0){

            String spell = inputSpell.split(" ")[0];
            int spellRow = Integer.parseInt(inputSpell.split(" ")[1]);
            int spellCol = Integer.parseInt(inputSpell.split(" ")[2]);
            healthPointsOfHeigan = healthPointsOfHeigan - damageForEachTurnOfHeigan;
            double damage = 0;
            if (healthPointsOfHeigan <= 0){
                break;
            }else {
                switch (spell){
                    case "Cloud":
                        damage = 3500;
                        if(isInPlagueCloud){
                            playerHealthPoints -= 3500;
                            isInPlagueCloud = false;
                        }
                            //hits of Heigan
                            damageOfMatrixCells(matrix, spellRow, spellCol, damage);

                            for (int row = spellRow - 1; row <= spellRow + 1 ; row++) {
                                for (int col = spellCol - 1; col <= spellCol + 1; col++) {
                                    if (matrix[row][col] % 500 == numberOfPlayer){
                                        matrix[row][col] -= numberOfPlayer;
                                        if (isInRangeOfMatrix(row - 1, col, matrix) && matrix[row - 1][col] == 0) {

                                                matrix[row - 1][col] += numberOfPlayer;
                                                playerRow = row - 1;
                                                playerCol = col;
                                                break;

                                        }else if (isInRangeOfMatrix(row, col + 1, matrix) && matrix[row][col + 1] == 0) {

                                                matrix[row][col + 1] += numberOfPlayer;
                                            playerRow = row;
                                            playerCol = col + 1;
                                                break;


                                        }else if(isInRangeOfMatrix(row + 1, col, matrix) && matrix[row + 1][col] == 0) {

                                                matrix[row + 1][col] += numberOfPlayer;
                                            playerRow = row + 1;
                                            playerCol = col;
                                                break;

                                        }else if(isInRangeOfMatrix(row, col - 1, matrix) && matrix[row][col - 1] == 0) {

                                                matrix[row][col - 1] += numberOfPlayer;
                                            playerRow = row;
                                            playerCol = col - 1;
                                                break;

                                        }else {
                                            // the player damage from this hits
                                            playerHealthPoints -= damage;
                                            matrix[row][col] += numberOfPlayer;
                                            isInPlagueCloud = true;

                                            if (playerHealthPoints <= 0){
                                                killedPlayer = true;
                                                typeOfKill = "Plague Cloud";

                                                break label;
                                            }
                                        }
                                    }
                                }
                            }



                        break;
                    case "Eruption":
                        damage = 6000;
                        damageOfMatrixCells(matrix, spellRow, spellCol, damage);
                        if(isInPlagueCloud){
                            playerHealthPoints -= 3500;
                            isInPlagueCloud = false;
                        }
                        for (int row = spellRow - 1; row <= spellRow + 1 ; row++) {
                            for (int col = spellCol - 1; col <= spellCol + 1; col++) {
                                if (matrix[row][col] % 500 == numberOfPlayer){
                                    matrix[row][col] -= numberOfPlayer;
                                    if (isInRangeOfMatrix(row - 1, col, matrix) && matrix[row - 1][col] == 0) {

                                        matrix[row - 1][col] += numberOfPlayer;
                                        playerRow = row - 1;
                                        playerCol = col;
                                        break;

                                    }else if (isInRangeOfMatrix(row, col + 1, matrix) && matrix[row][col + 1] == 0) {

                                        matrix[row][col + 1] += numberOfPlayer;
                                        playerRow = row;
                                        playerCol = col + 1;
                                        break;


                                    }else if(isInRangeOfMatrix(row + 1, col, matrix) && matrix[row + 1][col] == 0) {

                                        matrix[row + 1][col] += numberOfPlayer;
                                        playerRow = row + 1;
                                        playerCol = col;
                                        break;

                                    }else if(isInRangeOfMatrix(row, col - 1, matrix) && matrix[row][col - 1] == 0) {

                                        matrix[row][col - 1] += numberOfPlayer;
                                        playerRow = row;
                                        playerCol = col - 1;
                                        break;

                                    }else {
                                        // the player damage from this hits
                                        playerHealthPoints -= damage;
                                        matrix[row][col] += numberOfPlayer;

                                        if (playerHealthPoints <= 0){
                                            killedPlayer = true;
                                            typeOfKill = "Eruption";
                                            break label;
                                        }
                                    }
                                }
                            }
                        }
                        break;




                }



            }


            cleanTheField(matrix, spellRow, spellCol, damage);


            inputSpell = scanner.nextLine();
        }
        if (killedPlayer){
            System.out.printf("Heigan: %.2f%n", healthPointsOfHeigan);
            System.out.println("Player: Killed by " + typeOfKill);
        }else {
            System.out.println("Heigan: Defeated!");
            System.out.println("Player: " + playerHealthPoints);
        }
        System.out.printf("Final position: %d, %d", playerRow, playerCol);
    }

    private static boolean isInRangeOfMatrix(int row, int col, double[][] matrix) {
        boolean isInRangeOfMatrix = true;
        if (row < 0 || row > matrix.length - 1 || col < 0 || col > matrix.length - 1){
            isInRangeOfMatrix = false;
        }

        return isInRangeOfMatrix;
    }

    private static void cleanTheField(double[][] matrix, int spellRow, int spellCol, double damage) {

        if(isValidIndexes(matrix, spellRow, spellCol)) {
            matrix[spellRow][spellCol] -= damage;
            if (isValidIndexes(matrix, spellRow - 1 , spellCol - 1)) {
                matrix[spellRow - 1][spellCol - 1] -= damage;
            }
            if (isValidIndexes(matrix, spellRow - 1, spellCol)) {
                matrix[spellRow - 1][spellCol] -= damage;
            }
            if(isValidIndexes(matrix, spellRow - 1, spellCol + 1)) {
                matrix[spellRow - 1][spellCol + 1] -= damage;
            }
            if (isValidIndexes(matrix, spellRow, spellCol - 1)){
                matrix[spellRow][spellCol - 1] -= damage;
            }
            if (isValidIndexes(matrix, spellRow, spellCol + 1)) {
                matrix[spellRow][spellCol + 1] -= damage;
            }
            if (isValidIndexes(matrix, spellRow + 1, spellCol - 1)) {
                matrix[spellRow + 1][spellCol - 1] -= damage;
            }
            if (isValidIndexes(matrix, spellRow + 1, spellCol)) {
                matrix[spellRow + 1][spellCol] -= damage;
            }
            if (isValidIndexes(matrix, spellRow + 1, spellCol + 1)) {
                matrix[spellRow + 1][spellCol + 1] -= damage;
            }
        }



    }

    public static void damageOfMatrixCells(double[][] matrix, int spellRow, int spellCol, double damage){

        if(isValidIndexes(matrix, spellRow, spellCol)) {
            matrix[spellRow][spellCol] += damage;
          if (isValidIndexes(matrix, spellRow - 1 , spellCol - 1)) {
              matrix[spellRow - 1][spellCol - 1] += damage;
          }
          if (isValidIndexes(matrix, spellRow - 1, spellCol)) {
              matrix[spellRow - 1][spellCol] += damage;
          }
          if(isValidIndexes(matrix, spellRow - 1, spellCol + 1)) {
              matrix[spellRow - 1][spellCol + 1] += damage;
          }
          if (isValidIndexes(matrix, spellRow, spellCol - 1)){
                matrix[spellRow][spellCol - 1] += damage;
            }
          if (isValidIndexes(matrix, spellRow, spellCol + 1)) {
              matrix[spellRow][spellCol + 1] += damage;
          }
          if (isValidIndexes(matrix, spellRow + 1, spellCol - 1)) {
              matrix[spellRow + 1][spellCol - 1] += damage;
          }
          if (isValidIndexes(matrix, spellRow + 1, spellCol)) {
              matrix[spellRow + 1][spellCol] += damage;
          }
          if (isValidIndexes(matrix, spellRow + 1, spellCol + 1)) {
              matrix[spellRow + 1][spellCol + 1] += damage;
          }
        }


    }

    private static boolean isValidIndexes(double[][] matrix, int spellRow, int spellCol) {

        if (spellRow >= 0 && spellRow < matrix.length && spellCol >= 0 && spellCol < matrix.length){
            return true;
        }

        return false;
    }


}
