package L_04_Methods.MoreExercises;

import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        tribonacciSequencePrint(num);
    }

    private static void tribonacciSequencePrint(int num) {
        if (num == 1){
            System.out.println(1);
        }else if (num == 2){
            System.out.println(1 + " " + 1);
        }else if (num == 3){
            System.out.println(1 + " " + 1 + " " + 2);
        }else {
            int[] arrayTribonacci = new int[num];
            arrayTribonacci[0] = 1;
            arrayTribonacci[1] = 1;
            arrayTribonacci[2] = 2;
            for (int i = 3; i < num; i++) {
                arrayTribonacci[i] = arrayTribonacci[i - 3] + arrayTribonacci[i - 2]
                + arrayTribonacci[i - 1];
            }
            for (int result :
                    arrayTribonacci) {
                System.out.print(result + " ");
            }

        }

    }
}
