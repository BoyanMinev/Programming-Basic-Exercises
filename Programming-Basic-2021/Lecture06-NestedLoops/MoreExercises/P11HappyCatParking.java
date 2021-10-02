package P06NestedLoops.MoreExercises;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDays =Integer.parseInt(scanner.nextLine());
        int numHours = Integer.parseInt(scanner.nextLine());
        double totalParkingFee = 0;
        for (int i = 1; i <= numDays ; i++) {

            double parkingFee = 0.0;
            for (int j = 1; j <= numHours; j++) {

                if ((i % 2 == 0 ) && (j % 2 != 0)){
                    parkingFee+= 2.50;

                }else if((i % 2 != 0) && (j % 2 == 0)){
                    parkingFee+= 1.25;

                }else {
                    parkingFee += 1;
                }


            }
            totalParkingFee += parkingFee;
            System.out.printf("Day: %d - %.2f leva%n", i, parkingFee);

        }
        System.out.printf("Total: %.2f leva", totalParkingFee);
    }
}
