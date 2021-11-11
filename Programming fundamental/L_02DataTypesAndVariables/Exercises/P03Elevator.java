package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double numOfCourse = Math.ceil(1.0 * numberOfPeople / capacityOfElevator);
        System.out.printf("%.0f", numOfCourse);
    }
}
