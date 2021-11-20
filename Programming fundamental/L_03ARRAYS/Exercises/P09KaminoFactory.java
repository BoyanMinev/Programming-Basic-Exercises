package L_03ARRAYS.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int n = Integer.parseInt(scanner.nextLine());
       int maxLengthOfSequence = Integer.MIN_VALUE;
       int lengthSequence = 0;
       int startIndexSequence = 0;
       int countLengthOfSequence = 0;
       String input = scanner.nextLine();

       while(!input.equals("Clone them!")){

           int[] dnaSequence = Arrays.stream(input.split("!"))
                   .mapToInt(Integer::parseInt).toArray();
           for (int i = 0; i < dnaSequence.length; i++) {
               if (dnaSequence[i] == 1){
                   startIndexSequence = i;
                   countLengthOfSequence = 1;
                   for (int j = i + 1; j < dnaSequence.length ; j++) {
                       if (dnaSequence[j] == 1){
                           countLengthOfSequence ++;
                       }
                   }
               }
           }
           input = scanner.nextLine();
       }

    }
}
