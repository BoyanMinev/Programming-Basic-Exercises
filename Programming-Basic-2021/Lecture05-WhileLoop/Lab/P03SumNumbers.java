package L05WhileLoop.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = Integer.parseInt(scanner.nextLine());
        while(true){
                int currentNumber = Integer.parseInt(scanner.nextLine());
            sum +=currentNumber;
            if (sum >= number){
                    System.out.println(sum);
                    break;
                }
        }
    }
}
