package ExamExercises.Exam20and21April2019;

import java.util.Locale;
import java.util.Scanner;

public class P05EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPaintEgg = Integer.parseInt(scanner.nextLine());
        int countGreenEgg =0;
        int countRedEgg =0;
        int countOrangeEgg =0;
        int countBlueEgg =0;
        int maxEgg = 0;
        String colorMaxEgg = "";
        for (int i = 0; i < numPaintEgg; i++) {

            String color = scanner.nextLine();

            switch (color.toLowerCase()){
                case "red":
                    countRedEgg ++;
                    if (maxEgg < countRedEgg){
                        maxEgg = countRedEgg;
                        colorMaxEgg = color;
                }
                    break;
                case "blue":
                    countBlueEgg ++;
                    if (countBlueEgg > maxEgg){
                        maxEgg = countBlueEgg;
                        colorMaxEgg = color;
                    }
                    break;
                case "orange":
                    countOrangeEgg++;
                    if (countOrangeEgg > maxEgg){
                        maxEgg = countOrangeEgg;
                        colorMaxEgg = color;
                    }
                    break;
                case "green":
                    countGreenEgg++;
                    if (countGreenEgg > maxEgg){
                        maxEgg = countGreenEgg;
                        colorMaxEgg = color;
                    }
                    break;
            }


        }
        System.out.printf("Red eggs: %d\n" +
                "Orange eggs: %d\n" +
                "Blue eggs: %d\n" +
                "Green eggs: %d\n" +
                "Max eggs: %d -> %s", countRedEgg, countOrangeEgg, countBlueEgg, countGreenEgg, maxEgg, colorMaxEgg );
    }
}
