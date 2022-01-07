package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> userPoints = new LinkedHashMap<>();
        Map<String, Integer> languageSubmit = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while(!input.equals("exam finished")){
            String[] data = input.split("-");
            String username = data[0];
            if (data.length == 3) {
                String language = data[1];
                int points = Integer.parseInt(data[2]);

                if (!userPoints.containsKey(username)){
                    userPoints.put(username, points);
                }else {
                    if (userPoints.get(username) < points){
                        userPoints.put(username, points);
                    }
                }
                if (!languageSubmit.containsKey(language)){
                    languageSubmit.put(language, 1);
                }else {
                    languageSubmit.put(language, languageSubmit.get(language) + 1);
                }
            }else {
                userPoints.remove(username);
            }



            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoints.entrySet().stream().sorted(Map.Entry.<String , Integer>comparingByValue()
                .reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e-> System.out.println(e.getKey() + " | " + e.getValue()));
        System.out.println("Submissions:");
        languageSubmit.entrySet().stream().sorted(Map.Entry.<String , Integer>comparingByValue()
        .reversed()
        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e-> System.out.println(e.getKey() + " - " + e.getValue()));

    }
}
