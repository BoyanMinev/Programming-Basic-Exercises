package ExamExercises.Exam15And16June2019;

import java.util.Scanner;

public class P06MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = a1; i <= a2 - 1; i++) {
            if (i % 2 != 0){

                char symbol1 = (char) i;

                for (int j = 1; j <= n -1 ; j++) {
                    for (int k = 1; k <= n / 2 - 1; k++) {
                        int symbol4 = symbol1;
                        if ((j + k + i) % 2 != 0){
                            System.out.printf("%c-%d%d%d%n", symbol1, j, k, symbol4);
                        }
                    }
                }

            }
        }
    }
}
