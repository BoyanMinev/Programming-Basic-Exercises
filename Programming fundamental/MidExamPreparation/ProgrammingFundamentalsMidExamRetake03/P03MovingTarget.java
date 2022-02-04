package MidExamPreparation.ProgrammingFundamentalsMidExamRetake03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
           while(!input.equals("End")){
               String[] command = input.split(" ");
               if (command[0].equals("Shoot")){
                   int index = Integer.parseInt(command[1]);
                   int power = Integer.parseInt(command[2]);
                   commandShoot(index, power, targets);
               }else if (command[0].equals("Add")){
                   int index = Integer.parseInt(command[1]);
                   int value = Integer.parseInt(command[2]);
                   commandAdd(index, value, targets);
               }else if (command[0].equals("Strike")){
                   int index = Integer.parseInt(command[1]);
                   int radius = Integer.parseInt(command[2]);
                   commandStrike(index, radius, targets);
               }
               input = scanner.nextLine();
           }
        System.out.println(targets.toString().replaceAll("[\\[\\],]", "").replaceAll(" ", "|"));


        }


    private static void commandStrike(int index, int radius, List<Integer> targets) {
        if (index - radius >= 0 && index + radius <= targets.size() - 1){
            for (int i = 0; i < radius * 2 + 1  ; i++) {
                targets.remove(index - radius);
            }
        }else{
            System.out.println("Strike missed!");
        }
    }

    private static void commandAdd(int index, int value, List<Integer> targets) {
        if (index >= 0 && index <= targets.size() - 1){
            targets.add(index, value);
        }else {
            System.out.println("Invalid placement!");
        }
    }

    private static void commandShoot(int index, int power, List<Integer> targets) {
        if (index >= 0 && index <= targets.size() - 1){
            targets.set(index, targets.get(index) - power);
            if (targets.get(index) <= 0){
                targets.remove(index);
            }
        }
    }
}
