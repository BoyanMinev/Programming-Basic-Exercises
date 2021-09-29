package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startInterval = scanner.next().charAt(0);
        char finishInterval = scanner.next().charAt(0);
        char missWord = scanner.next().charAt(0);
        char combination1 = 0;
        char combination2 = 0;
        char combination3 = 0;
        int countCombinations = 0;

        for (int i = startInterval; i <= finishInterval; i++) {

            if (i != missWord){
                combination1 = (char) i;

            }else{
                continue;
            }

            for (int j = startInterval; j <= finishInterval; j++) {

                if (j != missWord){
                    combination2 = (char) j;

                }else{
                    continue;
                }

                for (int k = startInterval; k <= finishInterval; k++) {
                    if (k != missWord){
                        combination3 = (char) k;
                        countCombinations ++;
                        System.out.printf("%c%c%c ", combination1, combination2, combination3);

                    }

                }

            }
            
        }
        System.out.print(countCombinations);
    }
}
