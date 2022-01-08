package L_07_MapsLambdaAndStreamAPI.MoreExercises;

import java.util.*;

public class P01Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> contestPass = new LinkedHashMap<>();
        String input1 = scanner.nextLine();
        int maxPoints = Integer.MIN_VALUE;
        String bestCandidate = "";
        while (!input1.equals("end of contests")) {
            String[] data1 = input1.split(":");
            String contest = data1[0];
            String pass = data1[1];
            contestPass.put(contest, pass);


            input1 = scanner.nextLine();
        }
        String input2 = scanner.nextLine();
        Map<String, Map<String, Integer>> userPoints = new LinkedHashMap<>();
        Map<String, List<String>> contestsAndPoints = new LinkedHashMap<>();
        while (!input2.equals("end of submissions")) {
            String[] data2 = input2.split("=>");
            String contest = data2[0];
            String pass = data2[1];
            String username = data2[2];
            int points = Integer.parseInt(data2[3]);

            if (contestPass.containsKey(contest)) {
                if (contestPass.get(contest).equals(pass)) {
                    if (!userPoints.containsKey(username)) {

                        userPoints.put(username, new LinkedHashMap<>());

                        userPoints.get(username).put(contest, points);
                    } else {
                        if (!userPoints.get(username).containsKey(contest)) {

                            userPoints.get(username).put(contest, points);
                        }else {
                            if (userPoints.get(username).get(contest) < points) {
                                userPoints.get(username).put(contest, points);
                            }
                        }


                    }


                }
            }
            input2 = scanner.nextLine();
        }

        for (Map<String, Integer> user : userPoints.values()) {
            int totalPoints = 0;
            for (Integer point: user.values()) {
                totalPoints += point;

            }
            if (totalPoints > maxPoints){
                maxPoints = totalPoints;
                for (Map.Entry<String, Map<String , Integer>> entry : userPoints.entrySet()) {
                    if (userPoints.get(entry.getKey()).equals(user)){
                        bestCandidate = entry.getKey();
                    }
                }

            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestCandidate, maxPoints);
        System.out.println("Ranking:");
        userPoints.entrySet().stream().sorted(Map.Entry.<String, Map<String , Integer>>comparingByKey())
                .forEach(e -> {
            System.out.println(e.getKey());

                e.getValue().entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.<String, Integer>comparingByValue()))
                .forEach(s ->
                    System.out.printf("#  %s -> %d%n", s.getKey(),s.getValue()));


        });
    }
}
