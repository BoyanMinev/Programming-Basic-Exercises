package MidExamPreparation.ProgrammingFundamentalsMidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                        .collect(Collectors.toList());
        int health = 100;
        boolean isDied = false;
        int numReachRoom = 0;
        int bitcoin = 0;


            for (int i = 0; i < rooms.size(); i++) {

                String[] command = rooms.get(i).split(" ");
                if (command[0].equals("potion")){
                    int healedAmount = Integer.parseInt(command[1]);
                    int healthCurrent = healedAmount;
                            health += healedAmount;
                        if (health > 100){
                            healthCurrent =Math.abs(health - healedAmount - 100);
                            health = 100;
                        }

                    System.out.printf("You healed for %d hp.%n" +
                            "Current health: %d hp.", healthCurrent, health);
                    System.out.println();

                }else if (command[0].equals("chest")){
                    int bitcoinAmount = Integer.parseInt(command[1]);
                    bitcoin += bitcoinAmount;
                    System.out.printf("You found %d bitcoins.", bitcoinAmount);
                    System.out.println();
                }else{
                    int attackOfMonster = Integer.parseInt(command[1]);
                    health -= attackOfMonster;
                    if (health > 0){
                        System.out.printf("You slayed %s.", command[0]);
                        System.out.println();
                    }else {
                        System.out.printf("You died! Killed by %s.", command[0]);
                        System.out.println();
                        isDied = true;
                        numReachRoom = i + 1;
                        break;
                    }
                }

            }




        if (isDied){
            System.out.printf("Best room: %d", numReachRoom);
        }else {
            System.out.printf("You've made it!%n" +
                     "Bitcoins: %d%n" +
                    "Health: %d", bitcoin, health);
        }

    }
}
