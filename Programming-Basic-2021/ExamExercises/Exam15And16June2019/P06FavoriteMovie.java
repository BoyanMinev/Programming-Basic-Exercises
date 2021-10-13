package ExamExercises.Exam15And16June2019;

import java.util.Scanner;

public class P06FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxSymbols = Integer.MIN_VALUE;
        String bestMovie = "";
        int bestAsciSum = 0;
        int countTotalFilms = 0;
        boolean isReached = false;

        while(!input.equals("STOP")){
            int sumSymbols = 0;
            for (int i = 0; i < input.length(); i++) {

                char symbol = input.charAt(0 + i);

                sumSymbols += symbol;

                if (symbol >= 97 && symbol <= 122){
                    sumSymbols -= 2 * input.length();
                }else if (symbol>=65 && symbol <= 90){
                    sumSymbols -= input.length();
                }



            }
            if (sumSymbols > maxSymbols){
                maxSymbols = sumSymbols;
                bestMovie = input;
                bestAsciSum = sumSymbols;
            }


            countTotalFilms++;

            if (countTotalFilms == 7){
                isReached = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isReached){

            System.out.printf("The limit is reached.%n");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", bestMovie, bestAsciSum);

    }
}
