package L_09_RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        String regexName = "(?<name>[A-Za-z])";
        String regexDistance = "(?<distance>\\d)";
        Pattern patternName = Pattern.compile(regexName);
        Pattern patternDistance = Pattern.compile(regexDistance);
        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        while(!input.equals("end of race")){
            Matcher matcherName = patternName.matcher(input);
            Matcher matcherDistance = patternDistance.matcher(input);
            StringBuilder name = new StringBuilder();
        int distance = 0;
            while(matcherName.find()){
                name.append(matcherName.group());
            }
            while (matcherDistance.find()){
                distance += Integer.parseInt(matcherDistance.group());
            }
            if (racers.contains(name.toString())){
                if (!racersDistance.containsKey(name.toString())) {
                    racersDistance.put(name.toString(), distance);
                }else {
                    racersDistance.put(name.toString(), racersDistance.get(name.toString()) + distance);

                }

            }


            input = scanner.nextLine();
        }
        List<String> topThreeRacers = racersDistance.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry-> entry.getKey())
                .collect(Collectors.toList());




            System.out.println("1st place: " + topThreeRacers.get(0));
            System.out.println("2nd place: " + topThreeRacers.get(1));
            System.out.println("3rd place: " + topThreeRacers.get(2));


    }
}
