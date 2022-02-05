package MidExamPreparation.ProgrammingFundamentalsMidExamRetake6August2019;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> statusPirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt)
                        .collect(Collectors.toList());
                        List<Integer> statusWarShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt)
                                        .collect(Collectors.toList());

           int maxHealthASectionCanReach = Integer.parseInt(scanner.nextLine());
           String input = scanner.nextLine();


           while(!input.equals("Retire")){
               String[] command = input.split(" ");
               switch (command[0]) {
                   case "Fire":
                       if (commandFire(statusWarShip, command)) {
                           return;
                       }

                       break;
                   case "Defend":
                       if (commandDefend(command, statusPirateShip)) {
                           return;
                       }

                       break;
                   case "Repair":
                       commandRepair(statusPirateShip, command, maxHealthASectionCanReach);
                       break;
                   case "Status":
                       commandStatus(statusPirateShip, maxHealthASectionCanReach);
                       break;
               }
               input = scanner.nextLine();
           }



                int pirateShipStatus = 0;
                int warShipStatus = 0;
        for (Integer integer : statusPirateShip) {
            pirateShipStatus += integer;
        }
        for (Integer integer : statusWarShip) {
            warShipStatus += integer;
        }
                System.out.printf("Pirate ship status: %d\n" +
                        "Warship status: %d\n", pirateShipStatus, warShipStatus);
            }




    private static void commandStatus(List<Integer> statusPirateShip, int maxHealthASectionCanReach) {

        int countNeedRepairsSection = 0;
        double criticHealthSection = maxHealthASectionCanReach * 0.2;
        for (Integer integer : statusPirateShip) {
            if (integer < criticHealthSection) {
                countNeedRepairsSection++;
            }
        }

            System.out.printf("%d sections need repair.", countNeedRepairsSection);
            System.out.println();

    }


    private static void commandRepair(List<Integer> statusPirateShip, String[] command, int maxHealthASectionCanReach) {
        int index = Integer.parseInt(command[1]);
        int health = Integer.parseInt(command[2]);
        if (index >= 0 && index <= statusPirateShip.size() - 1){
            statusPirateShip.set(index, statusPirateShip.get(index) + health);
            if (statusPirateShip.get(index) > maxHealthASectionCanReach){
                statusPirateShip.set(index, maxHealthASectionCanReach);
            }
        }
    }

    private static boolean commandDefend(String[] command, List<Integer> statusPirateShip) {
boolean isPirateFail = false;
        int startIndex = Integer.parseInt(command[1]);
        int endIndex = Integer.parseInt(command[2]);
        int damage = Integer.parseInt(command[3]);
        if (startIndex >= 0 && endIndex <= statusPirateShip.size() - 1){
            for (int i = startIndex; i <= endIndex ; i++) {
                statusPirateShip.set(i, statusPirateShip.get(i) - damage);
                if (statusPirateShip.get(i) <= 0){
                    System.out.println("You lost! The pirate ship has sunken.");
                   isPirateFail = true;
                   break;
                }

            }
        }
        return isPirateFail;

        }



    private static boolean commandFire(List<Integer> statusWarShip, String[] command) {
        boolean isPirateWon = false;
        int index = Integer.parseInt(command[1]);
        int damage = Integer.parseInt(command[2]);
        if (index <= statusWarShip.size() - 1 && index >= 0){
            statusWarShip.set(index, statusWarShip.get(index) - damage);
            if (statusWarShip.get(index) <= 0){
                System.out.println("You won! The enemy ship has sunken.");
                isPirateWon = true;
            }
        }

        return isPirateWon;

    }
}
