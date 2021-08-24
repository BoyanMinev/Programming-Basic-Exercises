package L01FirstSpepsInCoding.MoreExercises;

import java.util.Scanner;

public class P09WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        if (weather.equalsIgnoreCase("sunny")){
            System.out.println("It's warm outside!");
        }else{
            System.out.println("It's cold outside!");
        }

    }
}
