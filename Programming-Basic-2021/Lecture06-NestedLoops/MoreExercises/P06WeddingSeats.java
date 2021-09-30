package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char sector = input.charAt(0);

        int numRowsSectorA = Integer.parseInt(scanner.nextLine());

        int numSeatsOddRow = Integer.parseInt(scanner.nextLine());

        int countSeats = 0;

        for (int i = 65; i <= sector; i++) {
            int numRows = numRowsSectorA + i - 65;


            for (int k = 1; k <= numRows; k++) {

                if (k % 2 != 0) {

                        for (int j = 97; j < 97 + numSeatsOddRow ; j++) {

                            countSeats++;
                            System.out.printf("%c%d%c%n", i, k, j);
                        }


                } else {
                    for (int m = 97; m < 97 + numSeatsOddRow + 2; m++) {

                            countSeats++;
                            System.out.printf("%c%d%c%n", i, k, m);


                    }
                }

            }


        }
        System.out.println(countSeats);


    }
}
