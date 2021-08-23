package L01FirstSpepsInCoding.MoreExercises;

import java.util.Scanner;

public class P01TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        //Пресмятания
        double faceTrapezoid = (b1 + b2) * h / 2;

        //Принтиране на резултат
        System.out.printf("%.2f" ,faceTrapezoid);

    }
}
