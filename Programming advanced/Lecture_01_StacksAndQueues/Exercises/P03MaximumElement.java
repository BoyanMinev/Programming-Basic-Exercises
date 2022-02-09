package Lecture_01_StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCommand = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numOfCommand; i++) {
            int[] command = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            if (command.length > 1){
                int elementToPush = command[1];
                stack.push(elementToPush);

            }else if (command[0] == 2){
                stack.pop();

            }else if (command[0] == 3){
                System.out.println(Collections.max(stack));
            }


        }
    }
}
