package L_07_MapsLambdaAndStreamAPI.MoreExercises;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class P03MOBAChallenger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> playerData = new LinkedHashMap<>();
        Map<String, Integer> playerTotalSkills = new LinkedHashMap<>();
        Map<String, Integer> playerPositionsAndSkills = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while(!input.equals("Season end")){

            String[] separator = input.split("\\s+");
            if (!separator[1]. equals("vs")) {
                String[] data = input.split(" -> ");

                String player = data[0];
                String position = data[1];
                int skill = Integer.parseInt(data[2]);
                if (!playerData.containsKey(player)) {
                    playerTotalSkills.put(player, skill);
                    playerData.put(player, new LinkedHashMap<>());
                    playerData.get(player).put(position, skill);
                    playerTotalSkills.put(player, skill);
                } else {

                    if (!playerData.get(player).containsKey(position)) {
                        playerData.get(player).put(position, skill);

                        playerTotalSkills.put(player, playerTotalSkills.get(player)
                                + skill);
                    } else {
                        if (playerData.get(player).get(position) < skill) {
                            playerTotalSkills.put(player, playerTotalSkills.get(player)
                                    + (skill - playerData.get(player).get(position)));
                            playerData.get(player).put(position, skill);
                        }
                    }
                }
            }else {
                String[] command = input.split(" vs ");
                String player1 = command[0];
                String player2 = command[1];
                String demandPlayer = "";
                if (playerData.containsKey(player1) && playerData.containsKey(player2)){

                    label:
                    for (Map.Entry<String, Integer> entry1  : playerData.get(player1).entrySet()) {

                        for (Map.Entry<String, Integer> entry2:playerData.get(player2).entrySet()) {
                            if(entry1.getKey().equals(entry2.getKey())){
                                if (playerTotalSkills.get(player1) >
                                        playerTotalSkills.get(player2)){
                                    demandPlayer = player2;
                                }else if (playerTotalSkills.get(player1) <
                                        playerTotalSkills.get(player2)){
                                    demandPlayer = player1;
                                }
                                playerData.remove(demandPlayer);
                                playerTotalSkills.remove(demandPlayer);
                                break label;

                            }
                        }

                    }
                }
            }



            input = scanner.nextLine();
        }

        playerData.entrySet()
                .stream().forEach(e -> Collections.reverseOrder(Map.Entry.<String, Integer>comparingByValue()));
        playerTotalSkills.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.<String, Integer>comparingByValue()))
                .forEach(e -> {
                    System.out.printf("%s: %d skill%n", e.getKey(), e.getValue());
                    playerData.get(e.getKey()).entrySet()
                            .stream()
                            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                            .forEach(s-> System.out.printf("- %s <::> %d%n",
                                    s.getKey(), s.getValue())); });
    }
}
