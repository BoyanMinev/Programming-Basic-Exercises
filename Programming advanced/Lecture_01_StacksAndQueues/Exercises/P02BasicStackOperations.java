package Lecture_01_StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numElementToPush = scanner.nextInt();
        int numElementToPop = scanner.nextInt();
        int checkThatElement = scanner.nextInt();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numElementToPush; i++) {
        stack.push(scanner.nextInt());
        }
        for (int i = 0; i < numElementToPop; i++) {
            stack.pop();
        }
        if(stack.isEmpty()){
            System.out.println(0);
        }else {
            if (stack.contains(checkThatElement)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(stack));
            }
        }

    }
}
