package L05WhileLoop.Lab;

import java.util.Scanner;

public class P09Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int volumeApartment = width * length * height;
        int volumeBoxes = 0;
        boolean isThereAnyMoreSpace = true;

        while (!input.equals("Done")){

            int boxes = Integer.parseInt(input);
            volumeBoxes += boxes;
            if (volumeApartment < volumeBoxes){
                isThereAnyMoreSpace = false;
                break;

            }

            input = scanner.nextLine();
        }
        int result = Math.abs(volumeApartment - volumeBoxes);

        if (isThereAnyMoreSpace){
            System.out.printf("%d Cubic meters left.", result);

        }else{
            System.out.printf("No more free space! You need %d Cubic meters more.", result);
        }

    }
}
