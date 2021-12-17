package L_06_ObjectAndClasses.Randomize;

import java.util.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());
        Random randomWord = new Random();


        for (int i = 0; i < words.size(); i++) {
            int randomIndex = randomWord.nextInt(words.size());
            String temp = words.get(i);

            words.set(i, words.get(randomIndex));
            words.set(randomIndex, temp);
        }
        for (String word :
                words) {
            System.out.println(word);

        }

    }
}
