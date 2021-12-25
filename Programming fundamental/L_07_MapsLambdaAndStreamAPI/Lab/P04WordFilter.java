package L_07_MapsLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(e -> e.length() % 2 == 0).toArray(String[] :: new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
