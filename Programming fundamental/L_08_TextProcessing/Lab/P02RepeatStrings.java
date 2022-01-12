package L_08_TextProcessing.Lab;

import java.util.Scanner;

public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder newWord = new StringBuilder();
        String[] array = scanner.nextLine().split("\\s+");
        for (int i = 0; i < array.length; i++) {
            int repeatTimes = array[i].length();
            for (int j = 0; j < repeatTimes ; j++) {

                newWord.append(array[i]);
            }
        }
        System.out.println(newWord.toString());
    }
}
