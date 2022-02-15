package Lecture_01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if (number == 0){
            System.out.println(number);
        }else {
            while (number != 0) {
            int reminderNumber = number % 2;
            number /= 2;

                stack.push(reminderNumber);

            }
        }
        for(Integer num : stack){
            System.out.print(num);
        }

    }
}
