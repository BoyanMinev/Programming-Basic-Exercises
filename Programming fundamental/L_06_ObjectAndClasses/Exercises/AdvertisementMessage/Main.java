package L_06_ObjectAndClasses.Exercises.AdvertisementMessage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> phrases = Arrays.asList("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product.");
        List<String> events = Arrays.asList("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!");
        List<String> authors = Arrays.asList("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva");
        List<String> cities = Arrays.asList("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse");
        for (int i = 0; i < n; i++) {

            System.out.println(randomChoice(phrases) + " " + randomChoice(events) + " "
                    + randomChoice(authors) + " - " + randomChoice(cities));
        }
    }

    private static String randomChoice(List<String> data) {

        Random randomChoice = new Random();
        int random = randomChoice.nextInt(data.size());
        return data.get(random);
    }
}
