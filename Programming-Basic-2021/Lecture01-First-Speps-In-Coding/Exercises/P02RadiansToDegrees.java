package L01FirstSpepsInCoding.Exercises;

import java.util.Scanner;

public class P02RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на код
        double radians = Double.parseDouble(scanner.nextLine());
        //Преобразуване  от радиани в градуси
        // градус = радиан * 180 / π

        double degrees = radians * 180/ Math.PI;

        //Принтиране на резултата

        System.out.printf("%.0f", degrees);

    }
}
