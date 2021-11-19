package L_03ARRAYS.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < array.length - 1; i++) {
            int countCampare = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    countCampare ++;
                    if (countCampare == array.length - (i + 1)){
                        System.out.print(array[i] + " ");
                    }
                }
            }

        }
        System.out.print(array[array.length - 1]);
    }
}
