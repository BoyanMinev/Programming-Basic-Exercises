package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCoins1lv = Integer.parseInt(scanner.nextLine());
        int numCoins2lv = Integer.parseInt(scanner.nextLine());
        int numBanknotes5lv = Integer.parseInt(scanner.nextLine());
        int neededSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numCoins1lv; i++) {

            for (int j = 0; j <= numCoins2lv; j++) {

                for (int k = 0; k <= numBanknotes5lv; k++) {

                    if ( ((i * 1) + (j * 2) + (k * 5)) == neededSum ){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, neededSum);
                    }

                }

            }

        }
    }
}
