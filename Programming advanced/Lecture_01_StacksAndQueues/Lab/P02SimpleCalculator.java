package Lecture_01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        String[] numbers = input.split("\\s+");


        // fill the stack with numbers and operators
        for (int i = numbers.length - 1; i >= 0; i--) {
            stack.push(numbers[i]);
        }

        //start calculate the numbers



            while (stack.size() > 1) {
                int leftNumber = Integer.parseInt(stack.poll());
                String operator = stack.poll();
                int rightNumber = Integer.parseInt(stack.poll());

                int result = operator.equals("+")
                        ? leftNumber + rightNumber
                        : leftNumber - rightNumber;
                stack.push(String.valueOf(result));

            }

            System.out.println(stack.poll());

    }
}
