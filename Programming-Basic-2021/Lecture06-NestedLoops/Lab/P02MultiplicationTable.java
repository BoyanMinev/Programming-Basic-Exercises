package P06NestedLoops.Lab;

import java.util.Scanner;

public class P02MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int a = 1; a <=10; a++) {
            for (int b = 1; b <=10 ; b++) {

                System.out.printf("%d * %d = %d\n", a, b, a * b);

            }

        }
    }
}
