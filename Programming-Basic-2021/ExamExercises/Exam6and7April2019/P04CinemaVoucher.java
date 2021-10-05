package ExamExercises.Exam6and7April2019;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valueVoucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int numTicket = 0;
        int numOtherThings = 0;
        while (!input.equals("End")){

                char a = input.charAt(0);
                char b = input.charAt(1);


                if (input.length() > 8){
                    int sumFilm = a + b;
                    valueVoucher -=sumFilm;
                    if (valueVoucher >= 0){
                        numTicket++;
                    }

                }else {

                    valueVoucher -= a;
                    if (valueVoucher >= 0){
                        numOtherThings++;
                    }
                }


            if (valueVoucher <= 0){
                break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%d%n" +
                "%d", numTicket, numOtherThings);
    }
}
