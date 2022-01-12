package L_08_TextProcessing.Lab;

import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while(!input.equals("end")){
            StringBuilder newWord = new StringBuilder();
            String temp = input;


            for (int i = temp.length() - 1; i >= 0 ; i--) {
                newWord.append(temp.charAt(i));
            }
            System.out.println(temp + " = " + newWord.toString());





            input = scanner.nextLine();
        }
    }
}
