package L_08_TextProcessing.Lab;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String input = scanner.nextLine();
        StringBuilder word = new StringBuilder(input);
        while(word.toString().contains(wordToRemove)){
            int startIndex = word.indexOf(wordToRemove);
            int endIndex = word.indexOf(wordToRemove) + wordToRemove.length();
            word.replace(startIndex, endIndex, "");


        }
        System.out.println(word.toString());
    }
}
