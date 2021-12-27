package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countIteration = 0;
        String resource = "";
        Map<String, Integer> miners = new LinkedHashMap<>();
        while(!input.equals("stop")){
            countIteration ++;

            if (countIteration % 2 == 0){
                int quantity = Integer.parseInt(input);

                if (!miners.containsKey(resource)){
                    miners.put(resource, quantity);
                }else {
                    miners.put(resource, miners.get(resource) + quantity);
                }
            }else{
                resource = input;
            }



            input = scanner.nextLine();
        }
       miners.forEach((s, integer) -> System.out.println(s + " -> " + integer));
    }
}
