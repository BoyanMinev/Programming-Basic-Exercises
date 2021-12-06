package L_04_Methods.MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num1 = Integer.parseInt(scanner.nextLine());
       int num2 = Integer.parseInt(scanner.nextLine());
       int num3 = Integer.parseInt(scanner.nextLine());
       int num4 = Integer.parseInt(scanner.nextLine());

        printPointCloserToTheCoordinateSystem(num1, num2, num3, num4);
    }

    private static void printPointCloserToTheCoordinateSystem(int num1, int num2, int num3, int num4) {
        double number1 = num1 * 1.0;
        double number2 = num2 * 1.0;
        double number3 = num3 * 1.0;
        double number4 = num4 * 1.0;



        double hypotenuse1 = Math.sqrt(Math.pow(Math.abs(num1), 2.0) + Math.pow(Math.abs(num2), 2.0));
        double hypotenuse2 = Math.sqrt(Math.pow(Math.abs(num3), 2.0) + Math.pow(Math.abs(num4), 2.0));
        if (hypotenuse1 <= hypotenuse2){
            System.out.printf("(%d, %d)", num1, num2);
        }else {
            System.out.printf("(%d, %d)", num3, num4);
        }
    }
}

