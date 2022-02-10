package Lecture_01_StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P04BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numElementToOffer = scanner.nextInt();
        int numElementToPull = scanner.nextInt();
        int checkThatElement = scanner.nextInt();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < numElementToOffer; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < numElementToPull; i++) {
            queue.poll();
        }
        if(queue.isEmpty()){
            System.out.println(0);
        }else {
            if (queue.contains(checkThatElement)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queue));
            }
        }

    }
}



