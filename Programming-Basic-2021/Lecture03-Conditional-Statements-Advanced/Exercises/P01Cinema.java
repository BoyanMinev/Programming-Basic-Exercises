package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int numRows = Integer.parseInt(scanner.nextLine());
        int numColumns = Integer.parseInt(scanner.nextLine());

        double result = 0.0;
        int numPlace = numColumns * numRows;

        if (typeProjection.equalsIgnoreCase("premiere")){
            result = 12.00 * numPlace;

        }else if (typeProjection.equalsIgnoreCase("normal")){
            result = 7.50 * numPlace;

        }else if (typeProjection.equalsIgnoreCase("discount")){
            result = 5.00 * numPlace;

        }
        System.out.printf("%.2f\n" +
                "leva", result);
    }
}
