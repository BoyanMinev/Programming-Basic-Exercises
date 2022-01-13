package L_08_TextProcessing.Lab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedList = scanner.nextLine().split(", ");
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        String replace= "";
        for (int i = 0; i < bannedList.length; i++) {
            while (text.toString().contains(bannedList[i])){
                StringBuilder censureWord = new StringBuilder();
                for (int j = 0; j < bannedList[i].length(); j++) {
                    censureWord.append("*");
                }
                int startIndex = text.indexOf(bannedList[i]);
                int endIndex = startIndex + bannedList[i].length();
                text.replace(startIndex, endIndex, censureWord.toString());
            }
        }
        System.out.println(text.toString());



    }
}
