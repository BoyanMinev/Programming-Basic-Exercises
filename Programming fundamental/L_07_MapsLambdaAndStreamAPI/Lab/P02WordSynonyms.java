package L_07_MapsLambdaAndStreamAPI.Lab;

import java.util.*;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            List<String> synonyms = new ArrayList<>();
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!wordSynonyms.containsKey(word)){
                synonyms.add(synonym);
                wordSynonyms.put(word, synonyms);
            }else {
                wordSynonyms.get(word).add(synonym);
                wordSynonyms.put(word, wordSynonyms.get(word));
            }
        }
        wordSynonyms.entrySet().stream().forEach(e -> System.out.println(e.getKey() +
                " - " + String.join(", ", e.getValue())));
    }
}
