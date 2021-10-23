package Exam;

import java.util.Scanner;

public class P06SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countCombination1 = 0;
        int countCombination2 = 0;
        boolean isFound1 = false;
        boolean isFound2 = false;
        label:
        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c ; d--) {

                       if ((a + b + c + d) == (a * b * c * d) && n % 10 == 5){
                           countCombination1++;
                           isFound1 = true;
                           if (countCombination1 == 1) {
                               System.out.printf("%d%d%d%d\n", a, b, c, d);
                               break label;
                           }
                       }else if (((a * b * c * d) / (a + b + c + d)) == 3 && n % 3 == 0){
                           countCombination2 ++;
                           isFound2 = true;
                           if (countCombination2 == 1) {
                               System.out.printf("%d%d%d%d\n", d, c, b, a);
                               break label;
                           }
                       }
                    }

                }

            }

        }
        if (!isFound1 && !isFound2 ){
            System.out.println("Nothing found");
        }
    }
}
