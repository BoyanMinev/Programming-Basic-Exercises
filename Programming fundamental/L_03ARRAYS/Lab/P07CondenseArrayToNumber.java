package L_03ARRAYS.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt).toArray();
        if (numbers.length == 1) {
            sum = Integer.parseInt(input);
        }else {


            if (numbers.length == 2){
                sum = numbers[0] + numbers[1];
            }
            while(numbers.length != 2) {
                int[] condensed = new int[numbers.length - 1];
                for (int i = 0; i < numbers.length - 1; i++) {
                    condensed[i] = numbers[i] + numbers[i + 1];
                    if (condensed.length == 2){
                        sum += condensed[i];
                    }
                }
                numbers = condensed;
            }
        }

        System.out.println(sum);
    }
}
