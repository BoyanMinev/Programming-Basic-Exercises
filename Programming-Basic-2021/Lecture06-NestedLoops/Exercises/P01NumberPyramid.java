package P06NestedLoops.Exercises;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                currentNum++;
                if (currentNum <= n){

                    System.out.printf("%d ", currentNum);
                }


            }
            System.out.println();
            }


    }
}
