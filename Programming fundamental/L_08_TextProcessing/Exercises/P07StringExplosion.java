package L_08_TextProcessing.Exercises;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        int morePower = 0;
        int strength = 0;
        for (int i = 0; i < text.length(); i++) {


            if (text.charAt(i) == '>' && strength == 0 ) {
                strength = Character.getNumericValue(text.charAt(i + 1)) + morePower;
                morePower = 0;


            } else if (strength > 0 && text.charAt(i) != '>') {
                text.deleteCharAt(i);
                i--;
                strength--;
            }else if(text.charAt(i) == '>' && strength > 0){
                morePower = strength;
                strength = 0;
                i --;
            }

        }

        System.out.println(text);
    }
}
