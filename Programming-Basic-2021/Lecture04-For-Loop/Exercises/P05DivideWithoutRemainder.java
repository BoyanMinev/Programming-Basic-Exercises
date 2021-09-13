package L04ForLoop.Exercises;

import java.util.Scanner;

public class P05DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 =0.0;
        double p2 =0.0;
        double p3 =0.0;
        int numNumberP1 = 0;
        int numNumberP2 = 0;
        int numNumberP3 = 0;
        for (int i = 1; i <= n ; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0){
                numNumberP1 ++;
            }if (number % 3 == 0){
                numNumberP2 ++;
            }if (number % 4 == 0){
                numNumberP3 ++;
            }


        }
        p1 = 1.0 * numNumberP1/n * 100;
        p2 = 1.0 * numNumberP2/n * 100;
        p3 = 1.0 * numNumberP3/n * 100;

        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%", p1, p2, p3);
    }
}
