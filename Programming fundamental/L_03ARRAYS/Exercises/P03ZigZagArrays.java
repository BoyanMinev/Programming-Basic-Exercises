package L_03ARRAYS.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i <  n; i++) {
            int[] currentNumbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0){
                array1[i] = currentNumbers[0];
                array2[i] = currentNumbers[1];
            }else {
                array1[i] = currentNumbers[1];
                array2[i] = currentNumbers[0];
            }
        }
        for (int numbers1 :
                array1) {
            System.out.print(numbers1 + " ");
        }
        System.out.println();
        for (int numbers2 :
                array2) {
            System.out.print(numbers2 + " ");
        }

    }
}
