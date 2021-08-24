package L01FirstSpepsInCoding.MoreExercises;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Стени
        //Предна и задна стена са квадрати с страна "x"
        //На предната стена има правоъгълна врата 1.2м / 2м

        //Страничните стени са правоъгълници със страни "x" и "y"
        //И на двете странични стени има по един квадратен прозорец с страна 1.5м

        //Покрив
        //Два правоъгълника със x и y
        //Два равностранни триъгълника със страна x и височина h

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double areaWalls = ((x * x) * 2) - (1.2 * 2) + ((x * y) * 2) - ((1.5 * 1.5) * 2);

        double areaRoof = ((x * y) * 2) + (((x * h) / 2) * 2);

        double neededGreenPaintInLitres = areaWalls / 3.4;
        double neededRedPaintInLitres = areaRoof / 4.3;

        System.out.printf("%.2f%n" +
                "%.2f", neededGreenPaintInLitres, neededRedPaintInLitres);

    }
}
