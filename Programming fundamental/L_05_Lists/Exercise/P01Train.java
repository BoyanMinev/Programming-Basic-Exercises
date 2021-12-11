package L_05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] command = input.split(" ");
            if (command[0].equals("Add")){
                int numPassengersInWagon = Integer.parseInt(command[1]);
                AddWagonsWithPassengers(wagons, numPassengersInWagon);
            }else{
                int numPassengers = Integer.parseInt(command[0]);
                AddPassengersToBigEnoughWagon(wagons, numPassengers, maxCapacity);
            }


            input = scanner.nextLine();
        }
        for (int passengers :
                wagons) {
            System.out.print(passengers + " ");
        }
    }


    private static void AddWagonsWithPassengers(List<Integer> wagons, int numPassengersInWagon) {
        wagons.add(numPassengersInWagon);
    }

    private static void AddPassengersToBigEnoughWagon(List<Integer> wagons, int numPassengers, int maxCapacity) {
        for (int i = 0; i < wagons.size(); i++) {
            if ((wagons.get(i) + numPassengers) <= maxCapacity){
                wagons.set(i, wagons.get(i) + numPassengers);
                break;
            }
        }
    }
}
