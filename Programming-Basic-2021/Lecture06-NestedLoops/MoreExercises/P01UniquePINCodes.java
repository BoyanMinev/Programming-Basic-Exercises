package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimit1 = Integer.parseInt(scanner.nextLine());
        int upperLimit2 = Integer.parseInt(scanner.nextLine());
        int upperLimit3 = Integer.parseInt(scanner.nextLine());
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i = 1; i <= upperLimit1; i++) {

            if (i % 2 == 0){
                num1 = i;

            }else{
                continue;
            }
            for (int j = 2; j <= upperLimit2; j++) {
               boolean isPrime =true;
                for (int k = 2; k < j; k++) {
                    if (j % k == 0){
                        isPrime = false;

                    }
                }
                if (isPrime){
                    num2 = j;
                }else{
                    continue;
                }
                for (int k = 1; k <= upperLimit3; k++) {
                    if (k % 2 == 0){
                        num3 = k;
                        System.out.printf("%d %d% d%n", num1, num2, num3);

                    }

                }
            }
        }
    }
}


