package L_08_TextProcessing.MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] keys = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        while (!input.equals("find")){
           String text = input;
           StringBuilder hiddenText = new StringBuilder();
                int counterTextSymbol = 0;
            for (int i = 0; i < keys.length ; i++) {
                counterTextSymbol ++;
                char symbol = (char)(text.charAt(counterTextSymbol - 1) - keys[i]);

                hiddenText.append(symbol);



                if (i == keys.length -1 ){
                    i = -1;
                }
                if (counterTextSymbol == text.length()){
                    break;
                }
            }
           int startIndexType = hiddenText.indexOf("&");
            int endIndexType = hiddenText.lastIndexOf("&");
            int startIndexCoordinate = hiddenText.indexOf("<");
            int endIndexCoordinate = hiddenText.lastIndexOf(">");
            StringBuilder type = new StringBuilder();
            StringBuilder coordinate = new StringBuilder();

            for (int i = startIndexType + 1; i < endIndexType; i++) {
               type.append(hiddenText.toString().charAt(i));
            }
            for (int i = startIndexCoordinate + 1; i < endIndexCoordinate ; i++) {
                coordinate.append(hiddenText.toString().charAt(i));
            }
            System.out.printf("Found %s at %s%n", type, coordinate);

            input = scanner.nextLine();
        }

    }
}
