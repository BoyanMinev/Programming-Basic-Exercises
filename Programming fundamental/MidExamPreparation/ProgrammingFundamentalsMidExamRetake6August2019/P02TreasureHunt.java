package MidExamPreparation.ProgrammingFundamentalsMidExamRetake6August2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> loots = Arrays.stream(scanner.nextLine().split("\\|"))
                        .collect(Collectors.toList());
           String input = scanner.nextLine();
           while (!input.equals("Yohoho!")){
               String[] command = input.split(" ");
               if (command[0].equals("Loot")){
                   commandLoot(loots, command);
                   }else if (command[0].equals("Drop")){
                   commandDrop(loots, command);
               }else if (command[0].equals("Steal")){
                   commandSteal(loots, command);
               }
               input = scanner.nextLine();
           }
           if (loots.size() == 0){
               System.out.println("Failed treasure hunt.");
           }else {
               double averageTreasureGain = 0;
               String loot = "";
               for (int i = 0; i < loots.size(); i++) {
                   loot = loots.get(i);
                   averageTreasureGain += loot.length();
               }
               averageTreasureGain = averageTreasureGain / loots.size();
               System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
           }
           }

    private static void commandSteal(List<String> loots, String[] command) {
       int countLootsToRemove = Integer.parseInt(command[1]);
        if (countLootsToRemove > loots.size()){
            countLootsToRemove = loots.size();
        }
        List<String> stealList = new ArrayList<>();
        for (int i = loots.size() - 1; i >= loots.size() - countLootsToRemove; i--) {
            stealList.add(0, loots.get(i));
        }
        for (int i = 0; i < countLootsToRemove; i++) {
            loots.remove(loots.size() - 1);
        }
        System.out.println(stealList.toString().replaceAll("[\\[\\],]", "").replaceAll(" ", ", "));
    }

    private static void commandDrop(List<String> loots, String[] command) {
        int removeLoot = Integer.parseInt(command[1]);
        if (removeLoot > loots.size() - 1 || removeLoot < 0){
            // Skip the command
        }else {

            String loot = loots.get(removeLoot);
            loots.remove(removeLoot);
            loots.add(loot);
        }
    }

    private static void commandLoot(List<String> loots, String[] command) {
        for (int i = 1; i < command.length; i++) {
            if (!loots.contains(command[i])) {
                loots.add(0, command[i]);
            }
    }
}
}
