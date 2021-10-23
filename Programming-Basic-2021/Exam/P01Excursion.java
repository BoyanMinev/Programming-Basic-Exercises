package Exam;

import java.util.Scanner;

public class P01Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int numOfNights  = Integer.parseInt(scanner.nextLine());
        int numOfCardForTransport = Integer.parseInt(scanner.nextLine());
        int numOfTicketForMuseum = Integer.parseInt(scanner.nextLine());

        double totalSumForAll = (((numOfCardForTransport * 1.60) + (numOfNights * 20) + (numOfTicketForMuseum * 6)) * numOfPeople ) * 1.25;
        System.out.printf("%.2f", totalSumForAll);
    }
}
