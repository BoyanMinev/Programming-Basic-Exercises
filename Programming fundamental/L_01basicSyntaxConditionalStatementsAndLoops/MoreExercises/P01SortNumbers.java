package L_01basicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class P01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        int midNum = 0;

        if (num1 > maxNum) {
            maxNum = num1;
        }if (num2 > maxNum) {
            maxNum = num2;
        }if (num3 > maxNum){
            maxNum = num3;
        }if (num1 < minNum){
            minNum = num1;
        }if (num2 < minNum){
            minNum = num2;
        }if (num3 < minNum){
            minNum = num3;
        }if (num1 > minNum && num1 < maxNum){
            midNum = num1;
        }if (num2 > minNum && num2 < maxNum){
            midNum = num2;
        }if (num3 > minNum && num3 < maxNum){
            midNum = num3;
        }
        System.out.println(maxNum);
        System.out.println(midNum);
        System.out.println(minNum);

    }
}
