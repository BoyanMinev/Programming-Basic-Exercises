package Lecture_01_StacksAndQueues.Exercises;

import java.util.ArrayDeque;

import java.util.Scanner;

public class P06BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();
        ArrayDeque<String> stackOfOpenParentheses = new ArrayDeque<>();
        boolean isIncorrectOrder = false;
        label:
        for (String symbol : sequence.split("")) {
            switch (symbol) {
                case "{":
                case "(":
                case "[":
                    stackOfOpenParentheses.push(symbol);
                    break;
                case "}": {
                    if (stackOfOpenParentheses.isEmpty()) {
                        System.out.println("NO");
                        isIncorrectOrder = true;
                        break label;
                    }
                    String compareSymbol = "{";
                    compareToSymbolInStack(compareSymbol, stackOfOpenParentheses);

                    break;
                }
                case ")": {
                    if (stackOfOpenParentheses.isEmpty()) {
                        System.out.println("NO");
                        isIncorrectOrder = true;
                        break label;
                    }
                    String compareSymbol = "(";
                    compareToSymbolInStack(compareSymbol, stackOfOpenParentheses);


                    break;
                }
                case "]": {
                    if (stackOfOpenParentheses.isEmpty()) {
                        System.out.println("NO");
                        isIncorrectOrder = true;
                        break label;
                    }
                    String compareSymbol = "[";
                    compareToSymbolInStack(compareSymbol, stackOfOpenParentheses);
                    break;
                }
            }
        }
        if (!isIncorrectOrder) {
            String output;
            if (stackOfOpenParentheses.isEmpty()) {
                output = "YES";
            } else {
                output = "NO";
            }
            System.out.println(output);
        }

    }

    private static void compareToSymbolInStack(String compareSymbol, ArrayDeque<String> stackOfOpenParentheses) {
           String symbol = stackOfOpenParentheses.pop();
        if (!symbol.equals(compareSymbol)) {
            stackOfOpenParentheses.push(symbol);
        }
    }
}
