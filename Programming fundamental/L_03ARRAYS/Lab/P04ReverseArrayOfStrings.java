package L_03ARRAYS.Lab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {

        //Прочитаме масив от стрингове
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        // {"a", "b", "c", ....}

        //Преобърнем масива
        for (int i = 0; i < input.length / 2; i++) {
            String temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;

        }

        //Принтираме обърнатия масив

        System.out.println(String.join(" ", input));
    }
}
