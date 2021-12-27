package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> legendary = new LinkedHashMap<>();

        Map<String, Integer> junk = new LinkedHashMap<>();
        boolean isObtained = false;
        boolean isExistShards = false;
        boolean isExistMotes = false;
        boolean isExistFragments = false;
        while (!isObtained) {
            String input = scanner.nextLine();
            String inputLowerCase = input.toLowerCase();
            String[] data = inputLowerCase.split("\\s+");
            int quantity = 0;
            String material = "";
            label:
            for (int i = 0; i < data.length ; i++) {


                quantity = Integer.parseInt(data[i]);

                material = data[i + 1];

                if (material.equals("motes") || material.equals("shards") || material.equals("fragments")) {


                    if (!legendary.containsKey(material)) {
                        legendary.put(material, quantity);
                    } else {
                        legendary.put(material, legendary.get(material) + quantity);
                    }

                    for (Map.Entry<String, Integer> ml : legendary.entrySet()) {
                        if (ml.getKey().equals("motes")) {
                            isExistMotes = true;
                            if (ml.getValue() >= 250) {
                                System.out.println("Dragonwrath obtained!");
                                ml.setValue(ml.getValue() - 250);
                                isObtained = true;
                                if (!isExistShards){
                                    legendary.put("shards", 0);
                                }if (!isExistFragments){
                                    legendary.put("fragments", 0);

                                }
                                break label;
                            }
                        } else if (ml.getKey().equals("fragments")) {
                            isExistFragments = true;
                            if (ml.getValue() >= 250) {
                                System.out.println("Valanyr obtained!");
                                ml.setValue(ml.getValue() - 250);
                                isObtained = true;
                                if (!isExistMotes){
                                    legendary.put("motes", 0);
                                }if (!isExistShards){
                                    legendary.put("shards", 0);

                                }
                                break label;
                            }
                        } else if (ml.getKey().equals("shards")) {
                            isExistShards = true;
                            if (ml.getValue() >= 250) {
                                System.out.println("Shadowmourne obtained!");
                                ml.setValue(ml.getValue() - 250);
                                isObtained = true;
                                if (!isExistMotes){
                                    legendary.put("motes", 0);
                                }if (!isExistFragments){
                                    legendary.put("fragments", 0);

                                }
                                break label;
                            }
                        }
                    }
                } else {


                    if (!junk.containsKey(material)) {
                        junk.put(material, quantity);
                    } else {
                        legendary.put(material, junk.get(material) + quantity);
                    }

                }
                i ++;
            }
        }
        legendary.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed().
                thenComparing(Map.Entry.<String, Integer>comparingByKey()))
                .forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey() +": "
                + stringIntegerEntry.getValue()));

        junk.entrySet().stream().sorted(Map.Entry.<String , Integer>comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));





    }
}
