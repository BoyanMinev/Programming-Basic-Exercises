package L04ForLoop.Lab;

import java.util.Scanner;

public class P09LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < 2 * n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if( i < n){
                leftSum += number;

            }
            else{
                rightSum += number;
            }
        }
        if (leftSum == rightSum){

            System.out.printf("Yes, sum = %d\n", leftSum);
        }else{
            int diff = Math.abs(leftSum - rightSum);
            System.out.printf("No, diff = %d\n", diff);
        }
    }
}
