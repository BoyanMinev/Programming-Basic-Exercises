package L_03ARRAYS.MoreExercises;

import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] compare = new int[n + 1];
        compare[0] = 1;

        for (int i = 1; i <= n; i++) {

            int[] numbers = new int[i];
            for (int j = 0; j < i; j++) {
                    if (j == 0){

                        numbers[j] = 1;
                    }else {
                        numbers[j] = compare[j] + compare[j - 1];
                    }

            }
            for (int j = 0; j < numbers.length; j++) {
                compare[j] = numbers[j];
            }
            for (int output :
                    numbers) {
                System.out.print(output + " ");
            }
            System.out.println();

        }
    }
}
