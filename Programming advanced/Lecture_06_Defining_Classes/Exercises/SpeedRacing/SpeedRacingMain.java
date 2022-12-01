package Lecture_06_Defining_Classes.Exersices.SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpeedRacingMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();

        int numOfCars = Integer.parseInt(scanner.nextLine());
        String[] tokens = null;
        while (numOfCars != 0){
            tokens = scanner.nextLine().split("\\s+");

            String carModel = tokens[0];
            int fuelAmount = Integer.parseInt(tokens[1]);
            double fuelCostOneKm = Double.parseDouble(tokens[2]);
            Car car = new Car(carModel, fuelAmount, fuelCostOneKm);
            cars.add(car);
            numOfCars --;
        }
        String [] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("End")){
            
            String commandDrive = command[0];
            String carModel = command[1];
            int amountOfKmToDrive = Integer.parseInt(command[2]);

            cars.stream()
                    .forEach(car -> {
                        if (car.getModel().equals(carModel)) {
                            car.drive(amountOfKmToDrive);
                        }
                    });



            command = scanner.nextLine().split("\\s+");
        }
        cars.forEach(System.out::println);
    }
}
