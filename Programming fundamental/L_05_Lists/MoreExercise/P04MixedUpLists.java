package L_05_Lists.MoreExercise;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();

        Collections.reverse(list2);
        int endLoop = 0;
        if (list1.size() < list2.size()) {
            endLoop = list1.size();

        } else {
            endLoop = list2.size();
        }
        for (int i = 0; i < endLoop; i++) {
            resultList.add(list1.get(i));
            resultList.add(list2.get(i));
        }
        for (int i = 0; i < endLoop; i++) {
            list1.remove(0);
            list2.remove(0);
        }
        int startIndex = 0;
        int endIndex = 0;
        if (list1.size() > list2.size()) {
            startIndex = Math.min(list1.get(0), list1.get(1));
            endIndex = Math.max(list1.get(0), list1.get(1));
        } else {
            startIndex = Math.min(list2.get(0), list2.get(1));
            endIndex = Math.max(list2.get(0), list2.get(1));
        }
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < resultList.size(); i++) {
            if (resultList.get(i) > startIndex && resultList.get(i) < endIndex){
                output.add(resultList.get(i));
            }
        }
        Collections.sort(output);
        System.out.println(output.toString().replaceAll("[\\[\\],]",""));
    }
}

