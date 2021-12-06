package L_04_Methods.MoreExercises;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());
        int num5 = Integer.parseInt(scanner.nextLine());
        int num6 = Integer.parseInt(scanner.nextLine());
        int num7 = Integer.parseInt(scanner.nextLine());
        int num8 = Integer.parseInt(scanner.nextLine());

        int line1 = lengthLine1(num1,num2,num3,num4);
        int line2 = lengthLine2(num5,num6,num7,num8);
        String line1OrderPrintPoints = line1PointCloserToTheCoordinateSystem(num1,num2,num3,num4);
        String line2OrderPrintPoints = line2PointCloserToTheCoordinateSystem(num5,num6,num7,num8);
        if (line1 >= line2){
            if (line1OrderPrintPoints.equals("first")){
                System.out.printf("(%d, %d)(%d, %d)", num1, num2, num3, num4);
            }else{
                System.out.printf("(%d, %d)(%d, %d)", num3, num4, num1, num2);
            }
        }else{
            if (line2OrderPrintPoints.equals("first")){
                System.out.printf("(%d, %d)(%d, %d)", num5, num6, num7, num8);
            }else{
                System.out.printf("(%d, %d)(%d, %d)", num7, num8, num5, num6);
            }
        }


    }

    private static int lengthLine1(int num1, int num2, int num3, int num4) {
        int length1 = 0;
        if (num1 >= 0 && num3 >= 0){
            length1 = Math.abs(num1 - num3);
        }else if(num1 <= 0 && num3 <= 0){
            length1 = Math.abs(Math.abs(num1) - Math.abs(num3));
        }else{
            length1 = Math.abs(num1) + Math.abs(num3);
        }
        int length2 = 0;
        if (num2 >= 0 && num4 >= 0){
            length2 = Math.abs(num2 - num4);
        }else if(num2 <= 0 && num4 <= 0){
            length2 = Math.abs(Math.abs(num2) - Math.abs(num4));
        }else{
            length2 = Math.abs(num2) + Math.abs(num4);
        }
        int result = length1 + length2;
        return result;
    }

    private static int lengthLine2(int num5, int num6, int num7, int num8) {
        int length1 = 0;
        if (num5 >= 0 && num7 >= 0){
            length1 = Math.abs(num5 - num7);
        }else if(num5 <= 0 && num7 <= 0){
            length1 = Math.abs(Math.abs(num5) - Math.abs(num7));
        }else{
            length1 = Math.abs(num5) + Math.abs(num7);
        }
        int length2 = 0;
        if (num6 >= 0 && num8 >= 0){
            length2 = Math.abs(num6 - num8);
        }else if(num6 <= 0 && num8 <= 0){
            length2 = Math.abs(Math.abs(num6) - Math.abs(num8));
        }else{
            length2 = Math.abs(num6) + Math.abs(num8);
        }
        int result = length1 + length2;
        return result;

    }

    private static String line1PointCloserToTheCoordinateSystem(int num1, int num2, int num3, int num4) {
        String result = "";
        double number1 = num1 * 1.0;
        double number2 = num2 * 1.0;
        double number3 = num3 * 1.0;
        double number4 = num4 * 1.0;



        double hypotenuse1 = Math.sqrt(Math.pow(Math.abs(num1), 2.0) + Math.pow(Math.abs(num2), 2.0));
        double hypotenuse2 = Math.sqrt(Math.pow(Math.abs(num3), 2.0) + Math.pow(Math.abs(num4), 2.0));
        if (hypotenuse1 <= hypotenuse2){
            result = "first";
        }else {
            result = "second";
        }
        return result;
    }

    private static String line2PointCloserToTheCoordinateSystem(int num5, int num6, int num7, int num8) {

        String result = "";
        double number1 = num5 * 1.0;
        double number2 = num6 * 1.0;
        double number3 = num7 * 1.0;
        double number4 = num8 * 1.0;



        double hypotenuse1 = Math.sqrt(Math.pow(Math.abs(num5), 2.0) + Math.pow(Math.abs(num6), 2.0));
        double hypotenuse2 = Math.sqrt(Math.pow(Math.abs(num7), 2.0) + Math.pow(Math.abs(num8), 2.0));
        if (hypotenuse1 <= hypotenuse2){
            result = "first";
        }else {
            result = "second";
        }
        return result;
    }
}
