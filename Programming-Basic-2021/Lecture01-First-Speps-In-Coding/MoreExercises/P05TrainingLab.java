package L01FirstSpepsInCoding.MoreExercises;

import java.util.Scanner;

public class P05TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        // Едно място е със размери 70 (ширина) и 120 (дължина)
        double wInCm = w * 100;
        double hInCm = h * 100;

        double numDeskOnRow = Math.floor((hInCm - 100) / 70);
        double numDeskOnColumn = Math.floor(wInCm / 120);
        double totalDeskPlace = (numDeskOnColumn * numDeskOnRow) - 3;

        System.out.printf("%.0f", totalDeskPlace);
    }
}
