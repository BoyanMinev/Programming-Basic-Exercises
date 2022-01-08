package L_07_MapsLambdaAndStreamAPI.MoreExercises;

import java.io.PrintStream;
import java.util.*;

public class P02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> contestsSubmits = new LinkedHashMap<>();
        Map<String, Integer> individualStandings = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while(!input.equals("no more time")){
            String[] data = input.split(" -> ");
            String username = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);

            if (!contestsSubmits.containsKey(contest)){
                contestsSubmits.put(contest, new LinkedHashMap<>());
                contestsSubmits.get(contest).put(username , points);
                if (!individualStandings.containsKey(username)) {
                    individualStandings.put(username, points);
                }else {
                    individualStandings.put(username, individualStandings.get(username) + points);
                }
            }else {
                if (contestsSubmits.get(contest).containsKey(username)){
                    if (points > contestsSubmits.get(contest).get(username)){
                        int previousValue = contestsSubmits.get(contest).get(username);
                        int diff = points - previousValue;
                        individualStandings.put(username, individualStandings.get(username) +
                                diff);
                        contestsSubmits.get(contest).put(username, points);
                    }

                }else{
                    contestsSubmits.get(contest).put(username, points);
                    if (!individualStandings.containsKey(username)) {
                        individualStandings.put(username, points);
                    }else {
                        individualStandings.put(username, individualStandings.get(username) + points);
                    }
                }
            }

            input = scanner.nextLine();
        }
        contestsSubmits.entrySet().forEach(e -> {
            System.out.printf("%s: %d participants%n", e.getKey(), e.getValue().size());
            final int[] i = {0};
            e.getValue().entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.<String, Integer>comparingByValue())
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(s ->
                {
                            i[0] ++;
                            System.out.printf("%d. %s <::> %d%n", i[0], s.getKey(), s.getValue());





                });
        });
        System.out.println("Individual standings:");
        int [] j = {0};
        individualStandings.entrySet().stream()
    .sorted(Collections.reverseOrder(Map.Entry.<String, Integer>comparingByValue())
    .thenComparing(Map.Entry.comparingByKey()))
    .forEach(e -> {
            j[0]++;
            System.out.printf("%d. %s -> %d%n", j[0], e.getKey(), e.getValue());
        });
    }
}
