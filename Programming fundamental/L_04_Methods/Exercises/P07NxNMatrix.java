package L_04_Methods.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printMatrix(n);
    }

    private static void printMatrix(int n) {
        int[] arrayMatrix = new int[n];
        Arrays.fill(arrayMatrix, n);
        for (int i = 0; i < n; i++) {
            for (int number :
                    arrayMatrix) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }
}
