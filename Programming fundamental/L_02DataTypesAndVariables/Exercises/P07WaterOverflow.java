package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int capacityOfTank = 255;
        int emptyTankCapacity = 255;

        for (int i = 0; i < n; i++) {

            int litresOfWater = Integer.parseInt(scanner.nextLine());

            if (capacityOfTank < litresOfWater){
                System.out.println("Insufficient capacity!");
                continue;
            }
            capacityOfTank -= litresOfWater;
        }
        int litresInTank = emptyTankCapacity - capacityOfTank;
        System.out.println(litresInTank);
    }
}
