package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSecond = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timePer1MetreInSec = Double.parseDouble(scanner.nextLine());


        double slowdownOn50Metres = Math.floor(distanceInMetres / 50);
        double plusSeconds = 30 * slowdownOn50Metres;


               double timeGeorgiInSec = timePer1MetreInSec * distanceInMetres;

               timeGeorgiInSec += plusSeconds;

               if (timeGeorgiInSec < recordInSecond){
                   System.out.printf("Yes! The new record is %.2f seconds.", timeGeorgiInSec);
               }else {
                   double diff = Math.abs(recordInSecond - timeGeorgiInSec);
                   System.out.printf("No! He was %.2f seconds slower.", diff);
               }




    }
}
