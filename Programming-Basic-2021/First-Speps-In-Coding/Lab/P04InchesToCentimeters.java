package L01FirstSpepsInCoding.Lab;

import java.util.Scanner;

public class P04InchesToCentimeters {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        double inchesToCentimeters = num * 2.54;

        System.out.println(inchesToCentimeters);


    }
}
