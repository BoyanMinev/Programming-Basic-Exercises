package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P05ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMan = Integer.parseInt(scanner.nextLine());
        int numWomen = Integer.parseInt(scanner.nextLine());
        int freeTable = Integer.parseInt(scanner.nextLine());
        int countTable = 0;

        label:
        for (int i = 1; i <= numMan ; i++) {
            for (int j = 1; j <= numWomen ; j++) {

                countTable++;
                if (countTable == freeTable){
                    System.out.printf("(%d <-> %d) ", i, j);
                    break label;
                }
                System.out.printf("(%d <-> %d) ", i, j);

            }

        }
    }
}
