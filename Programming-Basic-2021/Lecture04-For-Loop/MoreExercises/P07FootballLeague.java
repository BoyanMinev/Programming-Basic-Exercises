package L04ForLoop.MoreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int numFans = Integer.parseInt(scanner.nextLine());


        int fansInSectorA = 0;
        int fansInSectorB = 0;
        int fansInSectorV = 0;
        int fansInSectorG = 0;

        for (int i = 0; i < numFans; i++) {

            String sector = scanner.nextLine();


            if (sector.equalsIgnoreCase("A")) {
                fansInSectorA++;

            }
            if (sector.equalsIgnoreCase("B")) {
                fansInSectorB++;

            }
            if (sector.equalsIgnoreCase("V")) {
                fansInSectorV++;

            }
            if (sector.equalsIgnoreCase("G")) {
                fansInSectorG++;
            }
        }
        double percentFansSectorA = (1.0 * fansInSectorA / numFans) * 100;
        double percentFansSectorB = (1.0 * fansInSectorB / numFans) * 100;
        double percentFansSectorV = (1.0 * fansInSectorV / numFans) * 100;
        double percentFansSectorG = (1.0 * fansInSectorG / numFans) * 100;
        double percentTotalFans = (1.0 * numFans / stadiumCapacity) * 100;

        System.out.printf("%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%", percentFansSectorA, percentFansSectorB, percentFansSectorV,
                percentFansSectorG, percentTotalFans);


    }
}