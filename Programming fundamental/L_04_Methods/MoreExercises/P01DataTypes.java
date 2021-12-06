package L_04_Methods.MoreExercises;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataTypes = scanner.nextLine();
        String number = scanner.nextLine();

        calculatingDataTypes(dataTypes, number);
    }

    private static void calculatingDataTypes(String dataTypes, String number) {
        switch (dataTypes){
            case "int":
                int result1 = Integer.parseInt(number) * 2;
                System.out.println(result1);
                break;
            case "real":
                double result2 = Double.parseDouble(number) * 1.5;
                System.out.printf("%.2f", result2);
                break;
            case "string":
                String newString = "$" + number + "$";
                System.out.println(newString);
                break;

        }
    }
}
