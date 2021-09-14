package L04ForLoop.MoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int totalTons = 0;

        double priceMinibusTransport = 0.0;
        double priceTruckTransport = 0.0;
        double priceTrainTransport = 0.0;
        int totalTonsInMinibus = 0;
        int totalTonsInTruck = 0;
        int totalTonsInTrain = 0;

        for (int i = 0; i < n; i++) {

            int cargoInTons = Integer.parseInt(scanner.nextLine());

            totalTons +=cargoInTons;

            if (cargoInTons <= 3){
                totalTonsInMinibus +=cargoInTons;
                priceMinibusTransport += 200 * cargoInTons;

            }else if (cargoInTons <= 11){
                totalTonsInTruck += cargoInTons;
                priceTruckTransport += 175 * cargoInTons;

            }else{
                totalTonsInTrain +=cargoInTons;
                priceTrainTransport += 120 * cargoInTons;

            }



        }
        double midPriceForTon = (priceMinibusTransport + priceTruckTransport +
                priceTrainTransport) / totalTons;
        double percentMinibusTransport = (1.0 * totalTonsInMinibus/totalTons) * 100;
        double percentTruckTransport = (1.0 * totalTonsInTruck/totalTons) * 100;
        double percentTrainTransport = (1.0 * totalTonsInTrain/totalTons) * 100;

        System.out.printf("%.2f\n" +
                "%.2f%%\n" +
                "%.2f%%\n" +
                "%.2f%%", midPriceForTon, percentMinibusTransport, percentTruckTransport, percentTrainTransport);
    }
}
