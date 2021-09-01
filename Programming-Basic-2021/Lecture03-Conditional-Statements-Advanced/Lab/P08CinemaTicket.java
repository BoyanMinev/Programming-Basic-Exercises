package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P08CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day =scanner.nextLine();
        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("Friday")) {
            System.out.println(12);

        }else if (day.equalsIgnoreCase("Wednesday") ||
        day.equalsIgnoreCase("Thursday")){
            System.out.println(14);


        }else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
            System.out.println(16);
        }



    }
}
