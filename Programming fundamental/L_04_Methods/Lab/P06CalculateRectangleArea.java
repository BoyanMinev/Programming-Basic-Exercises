package L_04_Methods.Lab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());;
        double area = areaRectangle(width, length);
        System.out.printf("%.0f",area);
    }

    private static double areaRectangle(double width, double length) {

        return width * length;
    }
}
