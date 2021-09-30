package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int xa = Integer.parseInt(scanner.nextLine());
        int yb = Integer.parseInt(scanner.nextLine());
        int maxNumParoles = Integer.parseInt(scanner.nextLine());
        int countParoles = 0;

        int num1 = 35;
        int num2 = 64;

        for (int x = 1; x <= xa; x++) {


            for (int a = num1, b = num2, y = 1; num1 <= 55 && num2 <= 96 && y <= yb; num1++, num2++, y++) {


                countParoles++;
                System.out.printf("%c%c%d%d%c%c|", num1, num2, x, y, num2, num1);
                if (num1 == 55){
                    num1 = 35;
                    if (y == yb){
                        num1 = 34;
                    }
                }if (num2 == 96){
                    num2 = 64;
                    if (y == yb){
                        num2 = 63;
                    }
                }
                if (countParoles == maxNumParoles) {

                    return;
                }
            }


        }

    }

}



