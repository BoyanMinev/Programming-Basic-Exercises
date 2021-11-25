package L_03ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class DemoReverseAnArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] input = Arrays.stream(scanner.nextLine().split(" "))
               .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int number :
                input) {
            System.out.print(number + " ");
        }
    }
}

