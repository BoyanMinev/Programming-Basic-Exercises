package L_08_TextProcessing.Exercises;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0;
        for (int i = 0 ;i < input.length; i++) {

            StringBuilder pass = new StringBuilder(input[i]);
            char firstLetter = pass.charAt(0);
            char secondLetter = pass.charAt(pass.length() - 1);
            pass.deleteCharAt(0);
            pass.deleteCharAt(pass.length() - 1);
            double number = Double.parseDouble(pass.toString());
            for (int j = 1; j <=2; j++) {


                if (j == 1) {

                    if (Character.isUpperCase(firstLetter)) {
                        int letterPosition = firstLetter - 64;
                        number /= letterPosition;
                    } else {
                        int letterPosition = firstLetter - 96;
                        number *= letterPosition;

                    }
                } else {
                    if (Character.isUpperCase(secondLetter)) {
                        int letterPosition = secondLetter - 64;
                        number -= letterPosition;
                    } else {
                        int letterPosition = secondLetter - 96;
                        number += letterPosition;
                    }
                }
            }
            totalSum += number;


        }
        System.out.printf("%.2f", totalSum);

    }
}
