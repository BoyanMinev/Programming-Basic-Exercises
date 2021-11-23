package L_03ARRAYS.MoreExercises;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wontedElement = Integer.parseInt(scanner.nextLine());
        int[] array = new int[wontedElement];

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < wontedElement ; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(array[wontedElement - 1]);
    }

}
