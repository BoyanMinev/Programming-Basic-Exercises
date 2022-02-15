package Lecture_01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!command.equals("Home")){
            if (command.equals("back")){
                if (stack.size() > 1) {
                   String urlForward =  stack.pop();
                    System.out.println(stack.peek());
                    queue.offer(urlForward);
                }else {
                    System.out.println("no previous URLs");
                }

            }else if (command.equals("forward")) {
                if (!queue.isEmpty()) {
                    String urlBackward = queue.poll();
                    System.out.println(urlBackward);
                    stack.push(urlBackward);
                }else {
                    System.out.println("no next URLs");
                }

            }else {

                stack.push(command);
                System.out.println(command);
                queue.clear();

            }



            command = scanner.nextLine();
        }

    }
}
