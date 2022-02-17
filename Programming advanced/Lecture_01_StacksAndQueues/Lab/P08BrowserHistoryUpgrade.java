package Lecture_01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> stack = new ArrayDeque<>();
        while (!command.equals("Home")){
            if (command.equals("back")){
                if (stack.size() > 1) {
                    stack.pop();
                    System.out.println(stack.peek());
                }else {
                    System.out.println("no previous URLs");
                }

            }else {
                stack.push(command);
                System.out.println(command);
            }



            command = scanner.nextLine();
        }

    }
}


