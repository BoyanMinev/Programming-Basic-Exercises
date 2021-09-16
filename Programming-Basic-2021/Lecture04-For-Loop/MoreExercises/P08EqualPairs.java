package L04ForLoop.MoreExercises;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int numCouple1 = 0;
        int numCouple2 = 0;

        int sumCouple = 0;
        int maxCouple = Integer.MIN_VALUE;
        int minCouple = Integer.MAX_VALUE;
        for (int i = 1; i <= n*2; i++) {

            int number = Integer.parseInt(scanner.nextLine());


            if (i % 2 != 0){
                numCouple1 = number;
            }else{
                numCouple2 = number;
                sumCouple = numCouple1 + numCouple2;

                if (sumCouple > maxCouple){
                    maxCouple = sumCouple;

                }if (sumCouple < minCouple){
                    minCouple = sumCouple;

                }

            }
        }
        if(maxCouple == minCouple){

            System.out.printf("Yes, value=%d",maxCouple);

        }else{
            int diff = Math.abs(maxCouple - minCouple);
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}
