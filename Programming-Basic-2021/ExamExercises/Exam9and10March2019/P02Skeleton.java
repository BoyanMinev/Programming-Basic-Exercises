package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minutesOnControl = Integer.parseInt(scanner.nextLine());
        int secondsOnControl = Integer.parseInt(scanner.nextLine());
        double lengthBeehive = Double.parseDouble(scanner.nextLine());
        int secondsPer100Metres = Integer.parseInt(scanner.nextLine());

        int totalSecondsOnControl = secondsOnControl + (minutesOnControl * 60);

        double secondsMarin = (lengthBeehive / 100) * secondsPer100Metres;

        secondsMarin -= (lengthBeehive / 120) * 2.5;

        if (secondsMarin <= totalSecondsOnControl){
            System.out.printf("Marin Bangiev won an Olympic quota!%n" +
                    "His time is %.3f.", secondsMarin);
        }else {
            double diff = secondsMarin - totalSecondsOnControl;
            System.out.printf("No, Marin failed! He was %.3f second slower.", diff);
        }
    }
}
