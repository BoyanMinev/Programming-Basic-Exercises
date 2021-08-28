package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P07WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeSwimMetre = Double.parseDouble(scanner.nextLine());

        double lostTime = Math.floor(distanceInMetres/ 15) * 12.5;
        double totalTimeDistance = (distanceInMetres * timeSwimMetre) + lostTime;

        if (recordSec > totalTimeDistance){

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeDistance);

        }else if (recordSec<totalTimeDistance){
            double missRecord = totalTimeDistance - recordSec;
            System.out.printf("No, he failed! He was %.2f seconds slower.", missRecord);
        }
    }
}
