package Lecture_01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;



public class P04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<String> output = new ArrayDeque<>();

        for (int index = 0; index < input.length() ; index++) {
            if (input.charAt(index) == '('){
                stack.push(index);
            }else if (input.charAt(index) == ')'){
                int startIndex = stack.pop();
                String expression = input.substring(startIndex, index + 1);
                System.out.println(expression);
            }
        }




    }
}
