package L04ForLoop.Lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int totalSum = 0;
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            switch(Character.toLowerCase(letter)){
                case 'a': totalSum += 1;break;
                case 'e': totalSum += 2;break;
                case 'i': totalSum += 3;break;
                case 'o': totalSum += 4;break;
                case 'u': totalSum += 5;break;

            }
        }
        System.out.println(totalSum);
    }
}
