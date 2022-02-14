package Lecture_01_StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfOperation = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stackOfTextChanges = new ArrayDeque<>();
        for (int i = 0; i < numberOfOperation; i++) {

            String[] commandData = scanner.nextLine().split(" ");

            String command = commandData[0];
            switch (command){
                case "1":
                    String textToAppend = commandData[1];
                    stackOfTextChanges.push(text.toString());
                    text.append(textToAppend);
                    break;
                case "2":
                    int countLastElementToErases = Integer.parseInt(commandData[1]);
                    stackOfTextChanges.push(text.toString());
                    text.delete(text.length() - countLastElementToErases, text.length());
                    break;
                case "3":
                    int returnIndex = Integer.parseInt(commandData[1]);
                    System.out.println(text.charAt(returnIndex - 1));
                    break;
                case "4":
                    text = new StringBuilder(stackOfTextChanges.pop());
                    break;

            }



        }

    }
}
