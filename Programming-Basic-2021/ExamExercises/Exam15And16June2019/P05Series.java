package ExamExercises.Exam15And16June2019;

import java.util.Scanner;

public class P05Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double totalPriceSerials = 0;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String serial = scanner.nextLine();

            double priceSerial = Double.parseDouble(scanner.nextLine());
            if (serial.equals("Thrones")){
                totalPriceSerials += priceSerial * 0.5;
            }else if (serial.equals("Lucifer")){
                totalPriceSerials += priceSerial * 0.6;
            }else if (serial.equals("Protector")){
                totalPriceSerials += priceSerial * 0.7;
            }else if (serial.equals("TotalDrama")){
                totalPriceSerials += priceSerial * 0.8;
            }else if (serial.equals("Area")){
                totalPriceSerials += priceSerial * 0.9;
            }else{
                totalPriceSerials += priceSerial;
            }
        }
        double diff = Math.abs(totalPriceSerials - budget);

        if (totalPriceSerials <= budget){

            System.out.printf("You bought all the series and left with %.2f lv.", diff);
        }else {
            System.out.printf("You need %.2f lv. more to buy the series!", diff);
        }

    }
}
