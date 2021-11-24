package L_03ARRAYS;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = {"one", "two"};
// == new String [] {"one", "two"};
// Process all array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = %s%n", i, arr[i]);
        }
    }
}
