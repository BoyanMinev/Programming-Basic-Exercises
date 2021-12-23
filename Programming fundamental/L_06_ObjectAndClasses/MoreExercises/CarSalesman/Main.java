package L_06_ObjectAndClasses.MoreExercises.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        String displacement = "n/a";
        String efficiency = "n/a";
        String modelEngine = null;
        int powerEngine = 0;
        List<Engine> engines = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            String[] data1 = scanner.nextLine().split("\\s+");
            modelEngine = data1[0];
            powerEngine = Integer.parseInt(data1[1]);
            if (data1.length == 3) {
                if (data1[2].charAt(0) > 64 && data1[2].charAt(0) < 91) {
                    efficiency = data1[2];
                    displacement = "n/a";
                } else {
                    displacement = data1[2];
                    efficiency = "n/a";
                }
            } else if (data1.length == 4) {

                displacement = data1[2];
                efficiency = data1[3];
            }else {
                displacement = "n/a";
                efficiency = "n/a";
            }
            Engine engine = new Engine(modelEngine, powerEngine, displacement, efficiency);
            engines.add(engine);

        }
        int n2 = Integer.parseInt(scanner.nextLine());
        String weight = "n/a";
        String color = "n/a";
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n2; i++) {

            String[] data2 = scanner.nextLine().split("\\s+");

            String model = data2[0];
            String currentEngine = data2[1];


            Engine engine = new Engine(modelEngine, powerEngine, displacement, efficiency);
            for (Engine e :
                    engines) {
             if (e.getModel().equals(currentEngine)){
                 engine = e;
             }
            }


            if (data2.length == 3) {
                if (data2[2].charAt(0) > 64 && data2[2].charAt(0) < 91) {
                    color = data2[2];
                    weight = "n/a";
                } else {
                    weight = data2[2];
                    color = "n/a";
                }
            } else if (data2.length == 4) {
                weight = data2[2];
                color = data2[3];
            }else {
                weight = "n/a";
                color = "n/a";
            }
            Car car = new Car(model, engine, weight, color);

            cars.add(car);
        }
        for (Car car: cars) {
            System.out.println(car.toString());
        }
    }
}
