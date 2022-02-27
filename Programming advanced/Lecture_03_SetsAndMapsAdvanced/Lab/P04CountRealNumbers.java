package Lecture_03_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] values = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> valuesWithOccurrences = new LinkedHashMap<>();

        for (double value : values){

            if (!valuesWithOccurrences.containsKey(value)){
                valuesWithOccurrences.put(value, 1);
            }else {
                valuesWithOccurrences.put(value, valuesWithOccurrences.get(value) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : valuesWithOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
