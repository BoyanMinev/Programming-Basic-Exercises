package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSnowballs = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.NEGATIVE_INFINITY;
        int snowballSnowMax = 0;
        int snowballTimeMax = 0;
        int snowballQualityMax = 0;

        for (int i = 0; i < numSnowballs; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((1.0 * snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > maxValue){
                maxValue = snowballValue;
                snowballQualityMax = snowballQuality;
                snowballSnowMax = snowballSnow;
                snowballTimeMax = snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, maxValue, snowballQualityMax);
    }
}
