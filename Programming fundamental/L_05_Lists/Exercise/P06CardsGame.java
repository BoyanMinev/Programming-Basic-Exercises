package L_05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> cardDeck1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> cardDeck2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());
        compareDesks(cardDeck1, cardDeck2);
    }

    private static void compareDesks(List<Integer> cardDeck1, List<Integer> cardDeck2) {
        int deckLength = cardDeck1.size();
        for (int i = 0; i < deckLength; i++) {
            if (cardDeck1.get(i) > cardDeck2.get(i)){
                cardDeck1.add(cardDeck1.get(i));
                cardDeck1.add(cardDeck2.get(i));
                cardDeck1.remove(cardDeck1.get(i));
                cardDeck2.remove(cardDeck2.get(i));
                deckLength = cardDeck2.size();
            }else if (cardDeck1.get(i) < cardDeck2.get(i)){
                cardDeck2.add(cardDeck2.get(i));
                cardDeck2.add(cardDeck1.get(i));
                cardDeck2.remove(cardDeck2.get(i));
                cardDeck1.remove(cardDeck1.get(i));
                deckLength = cardDeck1.size();
            }else {
                cardDeck1.remove(cardDeck1.get(i));
                cardDeck2.remove(cardDeck2.get(i));
                deckLength = cardDeck1.size();
            }
            i = -1;

        }
        int sum = 0;
        if (cardDeck2.size() == 0) {

            for (int i = 0; i < cardDeck1.size(); i++) {
                sum += cardDeck1.get(i);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }else {
            for (int i = 0; i < cardDeck2.size(); i++) {
                sum += cardDeck2.get(i);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }
}
