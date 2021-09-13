package L04ForLoop.Exercises;

import java.util.Scanner;

public class P04Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;
        int numNumberP1 = 0;
        int numNumberP2 = 0;
        int numNumberP3 = 0;
        int numNumberP4 = 0;
        int numNumberP5 = 0;

        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 200){
                numNumberP1 ++;

            }
            else if (number >=200 && number < 400){
                numNumberP2 ++;
            }
            else if (number >= 400 && number < 600){
                numNumberP3 ++;
            }
            else if (number >=600 && number < 800){
                numNumberP4 ++;
            }
            else{
                numNumberP5 ++;
            }

        }
        p1 = 1.0 * numNumberP1 / n * 100;
        p2 = 1.0 * numNumberP2 / n * 100;
        p3 = 1.0 * numNumberP3 / n * 100;
        p4 = 1.0 * numNumberP4 / n * 100;
        p5 = 1.0 * numNumberP5 / n * 100;
        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%",p1, p2, p3, p4, p5 );
    }
}
