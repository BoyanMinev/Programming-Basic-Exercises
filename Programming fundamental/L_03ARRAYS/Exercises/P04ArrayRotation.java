package L_03ARRAYS.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        String temp = "";
        for (int i = 0; i < n; i++) {
               temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array [j] = array[j + 1];
            }
            array[array.length - 1] = temp;

        }
        for (String output :
                array) {
            System.out.print(output + " ");
        }
    }
}

