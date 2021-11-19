package L_03ARRAYS.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int countEqualElements = 1;
        int maxElements = Integer.MIN_VALUE;
        int equalSequenceMax = 0;

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j <= i + 1; j++) {

                if (array[i] == array[j]){
                    countEqualElements ++;
                }else {
                    countEqualElements = 1;
                }
                if(countEqualElements > maxElements){
                    maxElements = countEqualElements;
                    equalSequenceMax = array[i];
                }
            }

        }
        for (int i = 0; i < maxElements; i++) {

            System.out.print(equalSequenceMax + " ");
        }
    }
}
