package L_09_RegularExpressions.MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tickets = input.replace(",", "").trim().split("\\s+");


        for (String ticket : tickets) {

            if (!isValidTicket(ticket)) {
                System.out.println("invalid ticket");
            } else {


                String regex = "(\\${5}\\$+)|(@{5}@+)|(#{5}#+)|(\\^{5}\\^+)";
                Pattern pattern = Pattern.compile(regex);

                Matcher matcher1 = pattern.matcher(ticket.substring(0, 10));
                Matcher matcher2 = pattern.matcher(ticket.substring(10));

                if (ticket.contains("$") || ticket.contains("#") || ticket.contains("@") || ticket.contains("^")) {


                    if (matcher1.find() && matcher2.find() && matcher1.group().equals(matcher2.group())
                    ) {

                        if (matcher1.group().length() == 10) {
                            System.out.printf("ticket \"%s\" - %d%c Jackpot!%n",
                                    ticket, matcher1.group().length(),
                                    matcher1.group().charAt(0));
                        } else {
                            System.out.printf("ticket \"%s\" - %d%c%n",
                                    ticket, matcher1.group().length(),
                                    matcher1.group().charAt(0));
                        }
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);
                }
            }


        }


    }


    private static boolean isValidTicket(String ticket) {

        return ticket.length() == 20;


    }


}





