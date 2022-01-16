package L_08_TextProcessing.Exercises;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String name : input) {

            if (isValid(name)){
                System.out.println(name);
            }
        }
    }

    private static boolean isValid(String name) {

        if (!(name.length() > 3 && name.length() < 16)){

            return false;
            }
        for (int i = 0; i < name.length(); i++) {
            char symbol = name.charAt(i);

            if (Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == 45 || symbol == 95 ){

            }else {
                return false;
            }


        }
        return true;


    }
}
