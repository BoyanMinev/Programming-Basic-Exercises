package L_08_TextProcessing.MoreExercises;

import java.util.Scanner;

public class P02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char index1= scanner.nextLine().charAt(0);
        char index2 = scanner.nextLine().charAt(0);
        char [] text = scanner.nextLine().toCharArray();
        int startIndex = Math.min(index1, index2);
        int endIndex =  Math.max(index1, index2);
        int sumSymbols = 0;
        for (char symbol : text) {

            if (symbol > startIndex && symbol < endIndex){
                sumSymbols += symbol;

            }


        }
        System.out.println(sumSymbols);

    }
}
