package MidExamPreparation.ProgrammingFundamentalsMidExam04;



import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while(!input.equals("Go Shopping!")){
            String[] command = input.split(" ");
            if (command[0].equals("Urgent")){
                String item = command[1];

                commandUrgent(item, groceries);
            }else if (command[0].equals("Unnecessary")){
                String item = command[1];
                commandUnnecessary(item, groceries);
            }else if (command[0].equals("Correct")){
                String oldItem = command[1];
                String newItem = command[2];
                commandCorrect(oldItem, newItem, groceries);
            }else if (command[0].equals("Rearrange")){
                String item = command[1];
                commandRearrange(item, groceries);
            }

            input = scanner.nextLine();
        }
        System.out.println(groceries.toString().replaceAll("[\\[\\],]", "").replaceAll(" ", ", "));
    }

    private static void commandRearrange(String item, List<String> groceries) {
        for (int i = 0; i < groceries.size(); i++) {
            if (groceries.get(i).equals(item)){
                groceries.remove(i);
                groceries.add(item);
            }
        }
    }

    private static void commandCorrect(String oldItem, String newItem, List<String> groceries) {
        for (int i = 0; i < groceries.size(); i++) {
            if (groceries.get(i).equals(oldItem)){
                groceries.set(i, newItem);
            }
        }
    }

    private static void commandUnnecessary(String item, List<String> groceries) {
        groceries.remove(item);
    }

    private static void commandUrgent(String item, List<String> groceries) {
        boolean isExist = false;
        for (int i = 0; i < groceries.size(); i++) {
            if (groceries.get(i).equals(item)){
                isExist = true;
            }
        }
        if (!isExist){
            groceries.add(0, item);
        }
    }
}
