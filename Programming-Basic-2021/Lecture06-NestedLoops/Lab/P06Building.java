package P06NestedLoops.Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFloors = Integer.parseInt(scanner.nextLine());
        int numRoomsOnFloor = Integer.parseInt(scanner.nextLine());
        String symbol = "";




        for (int i = numFloors; i >= 1; i--) {

            if (i == numFloors) {
                symbol = "L";
            } else if (i % 2 == 0) {
                symbol = "O";
            } else {
                symbol = "A";
            }



            for (int room = 0; room < numRoomsOnFloor; room++) {

                System.out.printf("%s%d%d ", symbol, i, room);
            }

            System.out.println();


        }
    }
}

