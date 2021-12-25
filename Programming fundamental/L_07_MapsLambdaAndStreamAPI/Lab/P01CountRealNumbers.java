package L_07_MapsLambdaAndStreamAPI.Lab;

import java.text.DecimalFormat;
import java.util.*;


public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(" ")).
                mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (double num : numbers) {
            if (!counts.containsKey(num)){
                counts.put(num, 1);
            }else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        DecimalFormat format = new DecimalFormat("#.########");
        counts.entrySet().stream().forEach(e -> System.out.println(format.format(e.getKey())
        + " -> " + e.getValue()));

    }
}
