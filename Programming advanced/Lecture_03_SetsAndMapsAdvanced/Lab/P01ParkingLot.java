package Lecture_03_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();

        while(!input.equals("END")){

            String direction = input.split(", ")[0];
            String carNumber = input.split(", ")[1];

           if (direction.equals("IN")){
               parkingLot.add(carNumber);
           }else {
               parkingLot.remove(carNumber);
           }

            input = scanner.nextLine();

        }
        String output = parkingLot.isEmpty()
                ? "Parking Lot is Empty"
                : parkingLot.stream().collect(Collectors.joining(System.lineSeparator()));

        System.out.println(output);
    }
}
