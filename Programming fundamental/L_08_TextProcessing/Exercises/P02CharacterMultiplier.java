package L_08_TextProcessing.Exercises;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        StringBuilder firstText = new StringBuilder(input[0]);
        StringBuilder secondText = new StringBuilder(input[1]);

        int totalSum = 0;
        int range = Math.max(input[0].length(), input[1].length());

        for (int i = 0; i < range ; i++) {

            if (firstText.length() == 0){
                totalSum += secondText.charAt(i);
            }else if (secondText.length() == 0){
                totalSum+= firstText.charAt(i);

            }else {
                totalSum += firstText.charAt(i) * secondText.charAt(i);
                firstText.deleteCharAt(i);
                secondText.deleteCharAt(i);
                range --;
                i --;
            }

        }
        System.out.println(totalSum);
    }
}
