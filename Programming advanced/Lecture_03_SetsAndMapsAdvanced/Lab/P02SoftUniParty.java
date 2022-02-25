package Lecture_03_SetsAndMapsAdvanced;

import java.awt.font.LineMetrics;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        Set<String> guests = new TreeSet<>();

        while (!inputData.equals("PARTY")){
            String guestReservation = inputData;
            guests.add(guestReservation);
            inputData = scanner.nextLine();
        }
        while (!inputData.equals("END")) {
            String guestArrived = inputData;
            if (guests.contains(guestArrived)) {
                guests.remove(guestArrived);
            }

            inputData = scanner.nextLine();
        }
        System.out.println(guests.size());
        System.out.println(String.join(System.lineSeparator(), guests));

    }
}
