package L_03ARRAYS;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 32;
        int b = 14;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swaping:" + " a = " + a + ", b = " + b);

    }
}
