package L01FirstSpepsInCoding.MoreExercises;

import java.util.Scanner;

public class P08CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double areaCircle = Math.PI * (r * r);
        double perimeter = (2 * Math.PI) * r;

        System.out.printf("%.2f%n" +
                "%.2f", areaCircle, perimeter);
    }
}
