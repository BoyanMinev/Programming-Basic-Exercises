package L_03ARRAYS.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfField = Integer.parseInt(scanner.nextLine());
        int[] ladybugsOnTheField = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] field = new int[sizeOfField];


        String input = scanner.nextLine();
        for (int i = 0; i < ladybugsOnTheField.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (ladybugsOnTheField[i] == j) {
                    field[j] = 1;
                }
            }
        }


        while (!input.equals("end")) {
            String[] action = input.split(" ");
            int startIndex = Integer.parseInt(action[0]);
            int moveIndex = Integer.parseInt(action[2]);
            int temp = 0;

            if (action[1].equals("right")) {
                int actionIndexRight = startIndex + moveIndex;
                if (actionIndexRight < field.length && actionIndexRight > 0) {

                    for (int i = actionIndexRight; i < field.length; i++) {
                        if (field[i] != 1) {

                            field[i] = field[startIndex];
                        }
                    }
                    field[startIndex] = temp;

                } else {
                    field[startIndex] = temp;
                }
            } else if (action[1].equals("left")) {

                int actionIndexLeft = startIndex - moveIndex;
                if (actionIndexLeft >= 0 && actionIndexLeft < field.length) {
                    for (int l = actionIndexLeft; l >= 0; l--) {
                        if (field[l] != 1) {
                            field[l] = field[startIndex];
                            break;
                        }
                    }
                    field[startIndex] = temp;
                }
            }
            input = scanner.nextLine();
        }

        for (int ladybugs :
                field) {
            System.out.print(ladybugs + " ");
        }
    }


}

