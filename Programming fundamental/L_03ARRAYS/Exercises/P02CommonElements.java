package L_03ARRAYS.Exercises;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                String[] firstRow = scanner.nextLine().split(" ");
                String[] secondRow = scanner.nextLine().split(" ");



        for (int i = 0; i < secondRow.length; i++) {
            for (int j = 0; j < firstRow.length; j++) {

               if(secondRow[i].equals(firstRow[j])){
                   System.out.print(secondRow[i] + " ");
               }

            }

        }
    }
}
