package Lecture_01_StacksAndQueues.Exercises;

import java.util.Scanner;

public class P07RecursiveFibonacci {
    public static long[] fibonacciMemory;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        fibonacciMemory = new long[n + 1];
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        if (fibonacciMemory[n] != 0) {
            return fibonacciMemory[n];
        }
            return fibonacciMemory[n] = fibonacci(n - 1) + fibonacci(n - 2);

    }


}

