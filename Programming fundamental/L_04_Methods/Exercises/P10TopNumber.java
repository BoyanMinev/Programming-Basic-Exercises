package L_04_Methods.Exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTopNumbersBetween1AndNumber(number);
    }

    private static void printTopNumbersBetween1AndNumber(int number) {
        for (int i = 1; i <= number ; i++) {

            boolean isApproved1 = topNumberRequirement1(i);
            boolean isApproved2 = topNumberRequirement2(i);
            if (isApproved1 && isApproved2){
                System.out.println(i);
            }
        }

    }

    private static boolean topNumberRequirement1(int i) {
        boolean isApprove = false;
        int sumDigits = 0;

        while (i != 0){
            int digit = i % 10;
            sumDigits += digit;
            i /= 10;
        }
        if (sumDigits % 8 == 0){
            isApprove = true;
        }
        return isApprove;
    }

    private static boolean topNumberRequirement2(int i) {
        boolean isApprove = false;
        while (i != 0){
            int digit = i % 10;
            i /= 10;
            if (digit % 2 != 0){
                isApprove = true;
            }
        }
        return isApprove;
    }
}
