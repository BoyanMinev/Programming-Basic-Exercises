package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Double> itemList = new LinkedHashMap<>();
        Map<String, Integer> itemAndCount = new LinkedHashMap<>();
        while (!input.equals("buy")){
            String[] data = input.split(" ");
            String item = data[0];
            int itemCount = Integer.parseInt(data[2]);
            double itemPrice = Double.parseDouble(data[1]);

                itemList.put(item, itemPrice);
                if (!itemAndCount.containsKey(item)) {
                    itemAndCount.put(item, itemCount);
                }else {
                    itemAndCount.put(item, itemAndCount.get(item) + itemCount);
                }


            input = scanner.nextLine();
        }
        itemList.entrySet().stream().forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue() * itemAndCount.get(e.getKey())));
    }
}
