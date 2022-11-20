package Lecture_06_Defining_Classes.Exersices.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSalesmanMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfEngine = Integer.parseInt(scanner.nextLine());

        List<Engine> engines = new ArrayList<>();
        List<Car> cars = new ArrayList<>();

        while (numOfEngine != 0){
            String [] engineData = scanner.nextLine().split("\\s+");
            String engineModel = engineData[0];
            int enginePower = Integer.parseInt(engineData[1]);
            Engine engine = null;
            if (engineData.length == 4){
                int engineDisplacement = Integer.parseInt(engineData[2]);
                String engineEfficiency = engineData[3];

                 engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);


            } else if (engineData.length == 3) {
                try {
                    int engineDisplacement = Integer.parseInt(engineData[2]);
                     engine = new Engine(engineModel, enginePower, engineDisplacement);
                }catch (Exception NumberFormatException){
                    String engineEfficiency = engineData[2];
                     engine = new Engine(engineModel, enginePower, engineEfficiency);
                }
            }else {
                 engine = new Engine(engineModel, enginePower);
            }

            engines.add(engine);

            numOfEngine--;
        }

        int numOfCars = Integer.parseInt(scanner.nextLine());


        while (numOfCars != 0){
            Car car = null;
            String[] carsData = scanner.nextLine().split("\\s+");
            String carModel = carsData[0];
            String engineModel = carsData[1];
            Engine engine = null;

            for (Engine e : engines) {
                if (e.getModel().equals(engineModel)) {
                    engine = new Engine(e.getModel(), e.getPower(), e.getDisplacement(), e.getEfficiency());
                }
            }
            if (carsData.length == 4){
                int carWeight = Integer.parseInt(carsData[2]);
                String carColor = carsData[3];


                car = new Car(carModel, engine, carWeight, carColor);

            } else if (carsData.length == 3) {
                try {
                    int carWeight = Integer.parseInt(carsData[2]);
                    car = new Car(carModel, engine, carWeight);
                }catch (Exception NumberFormatException){
                    String carColor = carsData[2];
                    car = new Car(carModel, engine, carColor);
                }
            }else {

                car = new Car(carModel, engine);
            }


            cars.add(car);

            numOfCars--;
        }


        cars.forEach(System.out::println);



    }
}
