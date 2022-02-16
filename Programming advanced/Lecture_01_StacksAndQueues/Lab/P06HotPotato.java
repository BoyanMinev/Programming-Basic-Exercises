package Lecture_01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int hotPotatoIndex = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i = 0; i <input.length ; i++) {
            queue.offer(input[i]);
        }

        while (queue.size() > 1){
            int range = hotPotatoIndex;

            for (int i = 1; i < range; i++) {
               String player =  queue.poll();
               queue.offer(player);
               if (i == queue.size()){
                   range -= queue.size();
                   i = 0;
               }

            }
            System.out.println("Removed " + queue.poll());


        }
        System.out.println("Last is " + queue.poll());
    }
}
