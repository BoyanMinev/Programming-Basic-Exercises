package L_04_Methods.Lab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input){
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(num1,num2));
                break;
            case "char":
                char symbol1 = scanner.nextLine().charAt(0);
                char symbol2 = scanner.nextLine().charAt(0);
                System.out.println(getMax(symbol1,symbol2));
                break;
            case "string":
                String text1 = scanner.nextLine();
                String text2 = scanner.nextLine();
                System.out.println(getMax(text1, text2));
        }


    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }

    private static char getMax(char first , char second) {
        
        if (first > second){
            return first;
        }
        return second;
    }

    private static int getMax(int num1 , int num2) {
        if (num1 > num2){
            return num1;
        }
        return num2;
    }


}

