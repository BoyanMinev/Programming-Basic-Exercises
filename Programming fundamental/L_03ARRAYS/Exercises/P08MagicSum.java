package L_03ARRAYS.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int givenNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < array.length; j++) {
                sum = array[i] + array[j];
                if (sum == givenNumber){
                    System.out.println(array[i] + " " + array[j]);
                }
            }

        }

    }
}

