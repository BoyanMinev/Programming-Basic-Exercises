package L03ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P08OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourForExam = Integer.parseInt(scanner.nextLine());
        int minutesForExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minutesOfArrival = Integer.parseInt(scanner.nextLine());

        int totalTimeForExam = (hourForExam * 60) + minutesForExam;
        int totalTimeArrival = (hourOfArrival * 60) + minutesOfArrival;

        if (totalTimeArrival <= totalTimeForExam && totalTimeArrival >= (totalTimeForExam - 30)) {
            if (totalTimeArrival >= (totalTimeForExam - 30) && totalTimeArrival != totalTimeForExam) {
                int minutesBeforeExam = totalTimeForExam - totalTimeArrival;
                System.out.printf("On time\n" +
                        "%d minutes before the start", minutesBeforeExam);
            }
            else if (totalTimeArrival == totalTimeForExam){

                System.out.println("On time");

            }

        } else if (totalTimeArrival < (totalTimeForExam - 30)) {
            int totalMinBeforeStart = totalTimeForExam - totalTimeArrival;
            if (totalMinBeforeStart > 60 && (totalMinBeforeStart % 60) != 0) {
                int hoursBeforeStart = totalMinBeforeStart / 60;
                int minBeforeStart = totalMinBeforeStart % 60;
                System.out.printf("Early\n" +
                        "%d:%d hours before the start", hoursBeforeStart, minBeforeStart);
            } else if ((totalMinBeforeStart >= 60) && ((totalMinBeforeStart % 60) == 0)) {
                int hoursBeforeStart = totalMinBeforeStart / 60;
                System.out.printf("Early\n" +
                        "%d:00 hours before the start", hoursBeforeStart);
            } else if (totalMinBeforeStart > 60 && (totalMinBeforeStart % 60) < 10) {
                int hoursBeforeStart = totalMinBeforeStart / 60;
                int minBeforeStart = totalMinBeforeStart % 60;
                System.out.printf("Early\n" +
                        "%d:0%d hours before the start", hoursBeforeStart, minBeforeStart);

            }
            else {
                System.out.printf("Early\n" +

                        "%d minutes before the start", totalMinBeforeStart);

            }

        } else if (totalTimeArrival > totalTimeForExam) {
            int totalMinAfterStart = totalTimeArrival - totalTimeForExam;
            if (totalMinAfterStart >= 60 && (totalMinAfterStart % 60) != 0) {
                int hoursAfterStart = totalMinAfterStart / 60;
                int minAfterStart = (totalTimeArrival - totalTimeForExam) % 60;
                System.out.printf("Late\n" +
                        "%d:%d hours after the start", hoursAfterStart, minAfterStart);
            } else if (totalMinAfterStart >= 60 && (totalMinAfterStart % 60) == 0) {
                int hoursAfterStart = totalMinAfterStart / 60;

                System.out.printf("Late\n" +
                        "%d:00 hours after the start", hoursAfterStart);
            }
            else {
                System.out.printf("Late\n" +
                        "%d minutes after the start", totalMinAfterStart);


            }


        }


    }

}


