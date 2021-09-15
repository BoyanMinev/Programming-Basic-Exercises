package L04ForLoop.MoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numberInterval1 = 0;
        int numberInterval2 = 0;
        int numberInterval3 = 0;
        int numberInterval4 = 0;
        int numberInterval5 = 0;
        int numInvalidNumber = 0;

        double totalPoints = 0.0;

        for (int i = 0; i < n; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (number >=0 && number <= 9){
                numberInterval1 ++;
                totalPoints += number * 0.2;

            }else if (number > 9 && number <= 19){
                numberInterval2 ++;
                totalPoints += number * 0.3;

            }else if (number > 19 && number <= 29){
                numberInterval3 ++;
                totalPoints += number * 0.4;

            }else if (number > 29 && number <= 39){
                numberInterval4 ++;
                totalPoints += 50;

            }else if (number > 39 && number <= 50){
                numberInterval5 ++;
                totalPoints += 100;

            }else{
                numInvalidNumber ++;
                totalPoints /= 2;

            }


        }
        double percentI1 = (1.0 * numberInterval1/n) * 100;
        double percentI2 = (1.0 * numberInterval2/n) * 100;
        double percentI3 = (1.0 * numberInterval3/n) * 100;
        double percentI4 = (1.0 * numberInterval4/n) * 100;
        double percentI5 = (1.0 * numberInterval5/n) * 100;
        double percentInvalid = (1.0 * numInvalidNumber/n) * 100;

        System.out.printf("%.2f\n" +
                "From 0 to 9: %.2f%%\n" +
                "From 10 to 19: %.2f%%\n" +
                "From 20 to 29: %.2f%%\n" +
                "From 30 to 39: %.2f%%\n" +
                "From 40 to 50: %.2f%%\n" +
                "Invalid numbers: %.2f%%", totalPoints, percentI1, percentI2, percentI3, percentI4, percentI5, percentInvalid);
    }
}
