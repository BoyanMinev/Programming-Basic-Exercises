package MidExamPreparation.ProgrammingFundamentalsMidExam05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        while(!input.equals("Craft!")){
            String[] command = input.split(" ");

            if (command[0].equals("Collect")){
                String item = command[2];
                commandCollect(item, items);
            }else if (command[0].equals("Drop")){
                String item = command[2];
                commandDrop(items, item);
            }else if (command[0].equals("Combine")){
                String[] subCommand = command[3].split(":");
                String oldItem = subCommand[0];
                String newItem = subCommand[1];
                commandCombineItems(items, oldItem, newItem);
            }else if (command[0].equals("Renew")){
                String item = command[2];
                commandRenew(items, item);
            }

            input = scanner.nextLine();
        }
        System.out.println(items.toString().replaceAll("[\\[\\],]", "").replaceAll(" ", ", "));
    }

    private static void commandRenew(List<String> items, String item) {
        if (items.contains(item)){
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).equals(item)){
                    items.remove(i);
                    items.add(item);
                }
            }
        }
    }

    private static void commandCombineItems(List<String> items, String oldItem, String newItem) {
        if (items.contains(oldItem)){
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).equals(oldItem)){
                    items.add(i + 1, newItem);
                }
            }
        }
    }

    private static void commandDrop(List<String> items, String item) {
        if (items.contains(item)){
            items.remove(item);
        }
    }

    private static void commandCollect(String item, List<String> items) {
        if(!items.contains(item)){
            items.add(item);
        }
    }
}
