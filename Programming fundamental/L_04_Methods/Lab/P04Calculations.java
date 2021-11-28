package L_04_Methods.Lab;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (input){
            case "add":
                addNumbers(num1,num2);
                break;
            case "multiply":
                multiplyNumbers(num1, num2);
                break;
            case "subtract":
                subtractNumbers(num1, num2);
                break;
            case "divide":
                divideNumbers(num1, num2);
                break;
        }

    }

    private static void addNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private static void multiplyNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void subtractNumbers(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void divideNumbers(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}
