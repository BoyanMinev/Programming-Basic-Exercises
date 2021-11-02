package L_01basicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countTrashesHeadset = lostGamesCount / 2;
        int countTrashesMouse = lostGamesCount / 3;
        int countTrashesKeyboard = lostGamesCount / 6;
        int countTrashesDisplay = lostGamesCount / 12;

        double priceForThings = (countTrashesDisplay * displayPrice) + (countTrashesHeadset * headsetPrice) + (countTrashesKeyboard * keyboardPrice) + (countTrashesMouse * mousePrice);
        System.out.printf("Rage expenses: %.2f lv.", priceForThings);

    }
}
