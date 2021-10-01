package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P09SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval = Integer.parseInt(scanner.nextLine());
        int finishInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countCombinations = 0;
        int magicCombination = 0;
        boolean isFoundMagicCombination = false;
        label:
        for (int i = startInterval; i <= finishInterval ; i++) {

            for (int j = startInterval; j <= finishInterval ; j++) {
                countCombinations++;

                if ((i + j) == magicNumber){
                    magicCombination = countCombinations;
                    System.out.printf("Combination N:%d (%d + %d = %d)", magicCombination, i, j, magicNumber);
                    isFoundMagicCombination = true;
                    break label;
                }
            }

        }
        if (!isFoundMagicCombination){
            System.out.printf("%d combinations - neither equals %d", countCombinations, magicNumber);
        }
    }
}
