package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beerKegs = Integer.parseInt(scanner.nextLine());
        double volumeKeg = 0;
        double biggestKeg = Double.NEGATIVE_INFINITY;
        String modelOfBiggestKeg = "";
        for (int i = 0; i < beerKegs; i++) {
            String modelKeg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            volumeKeg = Math.PI * Math.pow(radius, 2) * height;
            if (volumeKeg > biggestKeg){
                biggestKeg = volumeKeg;
                modelOfBiggestKeg = modelKeg;
            }


        }
        System.out.println(modelOfBiggestKeg);
    }
}
