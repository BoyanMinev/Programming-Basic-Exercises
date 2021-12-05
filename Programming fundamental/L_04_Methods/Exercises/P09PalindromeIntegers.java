package L_04_Methods.Exercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        while (!numbers.equals("END")){
            if (backwardReadNumbers(numbers).equals(numbers)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            numbers = scanner.nextLine();
        }
    }



    private static String backwardReadNumbers(String numbers) {
        String newOne = "";

        for (int i = numbers.length() - 1; i >= 0; i--) {
                char symbol = numbers.charAt(i);
                newOne += symbol;


        }
        return newOne;
    }
}
