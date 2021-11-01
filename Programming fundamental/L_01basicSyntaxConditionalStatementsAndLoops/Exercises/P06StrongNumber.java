package L_01basicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int currentNumber = Integer.parseInt(scanner.nextLine());
        String number = String.valueOf(currentNumber);


        int sumFactorial = 0;
        int numberModerate = currentNumber;

        for (int i = 0; i < number.length() ; i++) {
           int digit = numberModerate % 10;
            if (numberModerate >= 10 ) {
                numberModerate = numberModerate / 10;
            }
               int digitFactorial = 1;

            if (digit == 0){
                digitFactorial = 1;
            }else {
                for (int j = digit; j >= 1; j--) {

                    digitFactorial *= j;
                }
            }
            sumFactorial += digitFactorial;
        }
        if (sumFactorial == currentNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
