package L01FirstSpepsInCoding.Exercises;

import java.util.Scanner;

public class P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход

        int sheets = Integer.parseInt(scanner.nextLine());
        int sheetsPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        //Пресмятания
        int totalHours = sheets / sheetsPerHour;
        int neededHours = totalHours / days;

        //Принтиране на резултата

        System.out.println(neededHours);
    }
}
