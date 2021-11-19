package L_03ARRAYS.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean isFoundIndex = false;
        if (array.length == 1){
            System.out.print(0);
            return;
        }
        for (int i = 0; i < array.length ; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i + 1; j < array.length; j++) {

                rightSum += array[j];

            }
            for (int k = i - 1; k >= 0 ; k--) {
                leftSum += array[k];

            }
            if (rightSum == leftSum){
                isFoundIndex = true;
                System.out.print(i);
            }
        }
        if (!isFoundIndex){
            System.out.print("no");
        }
    }
}
