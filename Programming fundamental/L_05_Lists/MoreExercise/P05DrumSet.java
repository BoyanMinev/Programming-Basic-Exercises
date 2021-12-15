package L_05_Lists.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> theQualityOfEachDrumSet = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> eachDrumSet = new ArrayList<>();

        for (int i = 0; i < theQualityOfEachDrumSet.size(); i++) {
            eachDrumSet.add(theQualityOfEachDrumSet.get(i));
        }
        String input = scanner.nextLine();

        while (!input.equals("Hit it again, Gabsy!")){
            int hitPower = Integer.parseInt(input);
            for (int i = 0; i < eachDrumSet.size(); i++) {
                eachDrumSet.set(i,eachDrumSet.get(i) - hitPower);
            }

            for (int i = 0; i < eachDrumSet.size(); i++) {
                if (eachDrumSet.get(i) <= 0){
                    if (savings >= theQualityOfEachDrumSet.get(i) * 3) {
                        eachDrumSet.set(i, theQualityOfEachDrumSet.get(i));
                        savings -= theQualityOfEachDrumSet.get(i) * 3;
                    }else {
                        eachDrumSet.remove(i);
                        theQualityOfEachDrumSet.remove(i);
                        i = -1;
                    }
                }
            }
            input =scanner.nextLine();
        }
        System.out.println(eachDrumSet.toString().replaceAll("[\\[\\],]",""));
        System.out.printf("Gabsy has %.2flv.", savings);

    }
}
