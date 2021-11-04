package L_01basicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class P02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        String englishName = "";
        if (number >= 10 || number < -9) {
            digit = number % 10;
        }else {
            digit = number;
        }
        switch (digit){
            case 1:
                englishName = "one";
                break;
            case 2:
                englishName = "two";
                break;
            case 3:
                englishName = "three";
                break;
            case 4:
                englishName = "four";
                break;
            case 5:
                englishName = "five";
                break;
            case 6:
                englishName = "six";
                break;
            case 7:
                englishName = "seven";
                break;
            case 8:
                englishName = "eight";
                break;
            case 9:
                englishName = "nine";
                break;
            case 0:
                englishName = "zero";
                break;

        }

        System.out.println(englishName);

    }
}
