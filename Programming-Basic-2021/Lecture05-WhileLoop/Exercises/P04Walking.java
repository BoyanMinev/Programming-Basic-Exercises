package L05WhileLoop.Exercises;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalSteps = 0;
        boolean isDone = false;

        while (true) {
            if (input.equals("Going home")) {
                input = scanner.nextLine();
                int steps = Integer.parseInt(input);
                totalSteps += steps;
                if (totalSteps >= 10000) {
                    isDone = true;
                    break;
                } else {
                    break;
                }
            }

            int steps = Integer.parseInt(input);
            totalSteps += steps;

            if (totalSteps >= 10000) {
                isDone = true;
                break;
            }
            input = scanner.nextLine();
        }


        String output = "";
        int diff = Math.abs(totalSteps - 10000);
        if (isDone) {
            output = String.format("Goal reached! Good job!\n" +
                    "%d steps over the goal!", diff);

        } else {
            output = String.format("%d more steps to reach goal.", diff);
        }
        System.out.println(output);
    }
}
