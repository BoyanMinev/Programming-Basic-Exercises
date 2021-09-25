package P06NestedLoops.Exercises;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2 ; i++) {
            int currentNum = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 1; j <= 6; j++) {

                int num = currentNum % 10;
                currentNum /=10;


                if (j % 2 == 0){
                    evenSum += num;

                }else{
                    oddSum += num;
                }

            }


            if (evenSum == oddSum) {
                System.out.printf("%d ", i);
            }

        }
    }
}
