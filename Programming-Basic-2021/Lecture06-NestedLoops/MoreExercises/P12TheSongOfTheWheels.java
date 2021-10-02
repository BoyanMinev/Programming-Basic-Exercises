package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P12TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlValue = Integer.parseInt(scanner.nextLine());
        int countCombinations = 0;
        int countCombinationOn4 = 0;
        boolean isFound = false;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;


        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= 9; j++) {

                for (int k = 1; k <= 9; k++) {

                    for (int l = 1; l <= 9; l++) {


                        if (i < j && k > l && (i * j + k * l) == controlValue) {

                            countCombinations++;
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                            if (countCombinations == 4) {
                                countCombinationOn4 ++;
                                if (countCombinationOn4 == 1) {

                                    a = i;
                                    b = j;
                                    c = k;
                                    d = l;
                                    isFound = true;

                                }

                            }


                        }

                    }

                }

            }

        }
        if (isFound){
            System.out.println();
            System.out.printf("Password: %d%d%d%d", a, b, c, d);
        }else {
            System.out.println();
            System.out.println("No!");
        }

    }
}
