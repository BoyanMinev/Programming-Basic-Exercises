package Lecture_01_StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

       String[] inputNumbers = scanner.nextLine().split("\\s+");

        for (int i = 0; i < inputNumbers.length; i++) {
            stack.push(Integer.parseInt(inputNumbers[i]));
        }
        for (Integer number : stack){
            System.out.print(number + " ");
        }



    }
}
