package L_02DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sumOfNumbers = new BigDecimal(0);

        for (int i = 0; i < n ; i++) {

            BigDecimal currentNumber = new BigDecimal(scanner.nextLine());
            sumOfNumbers = sumOfNumbers.add(currentNumber);

        }
        System.out.println(sumOfNumbers);
    }
}
