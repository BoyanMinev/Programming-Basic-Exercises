package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P13PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startInterval1 = Integer.parseInt(scanner.nextLine());
        int startInterval2 = Integer.parseInt(scanner.nextLine());
        int diffStartAndFinish1 =Integer.parseInt(scanner.nextLine());
        int diffStartAndFinish2 =Integer.parseInt(scanner.nextLine());

        for (int i = startInterval1; i <= startInterval1 + diffStartAndFinish1 ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }


            }
            if (isPrime){

                for (int k = startInterval2; k <= startInterval2 + diffStartAndFinish2; k++) {
                        isPrime = true;
                    for (int l = 2; l < k ; l++) {
                        if (k % l == 0) {
                            isPrime = false;

                        }


                    }
                    if (isPrime){

                        System.out.printf("%d%d%n", i, k);
                    }

                }
            }
        }
    }
}
