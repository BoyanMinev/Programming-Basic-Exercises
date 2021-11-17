package L_03ARRAYS.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0){
                sumEven += numbers[i];
            }else {
                sumOdd += numbers[i];
            }

        }
        int result = sumEven - sumOdd;
        System.out.println(result);
    }
}
