package L_03ARRAYS.Exercises;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] countPeople = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int peopleInWagon = Integer.parseInt(scanner.nextLine());

            sum += peopleInWagon;
            countPeople[i] = peopleInWagon;

        }
        for (int numPeopleInWagon :
                countPeople) {
            System.out.print(numPeopleInWagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
