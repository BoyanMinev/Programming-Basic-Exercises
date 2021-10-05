package ExamExercises.Exam6and7April2019;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int countKidsTickets = 0;
        int countStudentTickets = 0;
        int countStandardTickets = 0;
        int totalTickets = 0;

        while (!input.equals("Finish")){
            int currentTickets = 0;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String typeTicket = scanner.nextLine();
            while (!typeTicket.equals("End")){
                    totalTickets++;
                   currentTickets++;
                switch (typeTicket.toLowerCase()){
                    case "standard":
                        countStandardTickets++;
                        break;
                    case "kid":
                        countKidsTickets++;
                        break;
                    case "student":
                        countStudentTickets++;
                        break;
                }
                if (currentTickets == freeSeats){
                    break;
                }

                typeTicket = scanner.nextLine();
            }
            double averageUsedSeats = 1.0 * currentTickets/freeSeats *100;
            System.out.printf("%s - %.2f%% full.%n", input, averageUsedSeats);

            input = scanner.nextLine();
        }
        double averageStudentTickets = 1.0 *countStudentTickets / totalTickets * 100;
        double averageStandardTickets = 1.0 *countStandardTickets / totalTickets * 100;
        double averageKidsTickets = 1.0 *countKidsTickets / totalTickets * 100;
        System.out.printf("Total tickets: %d\n" +
                "%.2f%% student tickets.\n" +
                "%.2f%% standard tickets.\n" +
                "%.2f%% kids tickets.", totalTickets, averageStudentTickets, averageStandardTickets, averageKidsTickets);

    }
}
