package Lecture_01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();
    while (!input.equals("print")){
        if (input.equals("cancel")){
            if (queue.isEmpty()){
                System.out.println("Printer is on standby");
            }else {
                System.out.println("Canceled " + queue.poll());
            }
        }else {
            queue.offer(input);
        }
        input = scanner.nextLine();
    }
    int range = queue.size();
        for (int n = 0; n < range; n++) {
            System.out.println(queue.poll());
        }

    }
}
