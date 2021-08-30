package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P06NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        if (number != 0 && number >= -100 && number <= 100) {

            System.out.println("Yes");

        }else{


            System.out.println("No");
        }
    }
}
