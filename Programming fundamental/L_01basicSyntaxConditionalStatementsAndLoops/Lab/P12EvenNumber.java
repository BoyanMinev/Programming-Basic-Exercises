package L_01basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0){
                number = Math.abs(number);
                System.out.printf("The number is: %d%n", number);
                break;

            }else {
                System.out.printf("Please write an even number.%n");

            }
        }
    }
}
