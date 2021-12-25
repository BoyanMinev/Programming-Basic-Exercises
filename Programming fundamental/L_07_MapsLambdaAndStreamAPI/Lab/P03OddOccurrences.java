package L_07_MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        Map<String, Integer> countWords = new LinkedHashMap<>();
        for (String word:words) {
            String wordToLowerCase = word.toLowerCase();
            if (!countWords.containsKey(wordToLowerCase)){
                countWords.put(wordToLowerCase, 1);
            }else {
                countWords.put(wordToLowerCase, countWords.get(wordToLowerCase) + 1);
            }
            
        }
        List<String> oddPlaces = new ArrayList<>();
        for (Map.Entry<String, Integer> element : countWords.entrySet()) {
            if (element.getValue() % 2 != 0){
                oddPlaces.add(element.getKey());
            }
        }
        System.out.println(String.join(", ", oddPlaces));
            
        
    }
}
