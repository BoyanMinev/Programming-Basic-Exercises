package L_08_TextProcessing.MoreExercises;

import java.util.Scanner;

public class P06WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String [] tickets = input.replace("," , "").split("\\s+");
        String [] winningSymbols = new String[1];
        for (int i = 0; i < tickets.length; i++) {

            String ticket = tickets[i];


            if (!isValidTicket(ticket)) {
                System.out.println("invalid ticket");
            } else {

                if (ticket.contains("$") || ticket.contains("@")
                        || ticket.contains("^") || ticket.contains("#")) {

                    if (isWinningTicket(ticket, winningSymbols)) {


                        if (winningSymbols[0].length() == 10){
                            System.out.printf("ticket \"%s\" - %d%c Jackpot!%n",
                                    ticket, winningSymbols[0].length(),
                                    winningSymbols[0].charAt(0));
                        }else {
                            System.out.printf("ticket \"%s\" - %d%c%n",
                                    ticket, winningSymbols[0].length(),
                                    winningSymbols[0].charAt(0));
                        }
                    }
                } else {
                    System.out.printf("ticket \"%s\" - no match%n", ticket);


                }


            }


        }


    }








    private static boolean isWinningTicket(String ticket, String [] winningSymbols) {

                String [] winningCombinations = {"$$$$$$$$$$", "##########", "@@@@@@@@@@", "^^^^^^^^^^", "$$$$$$$$$", "#########", "@@@@@@@@@", "^^^^^^^^^", "$$$$$$$$", "########", "@@@@@@@@", "^^^^^^^^", "$$$$$$$", "#######", "@@@@@@@", "^^^^^^^", "$$$$$$", "######", "@@@@@@", "^^^^^^"};

        for (String sequence : winningCombinations) {

            if (ticket.substring(0, 10).contains(sequence) &&
            ticket.substring(10).contains(sequence)){
                winningSymbols[0] = sequence;
                return true;
            }
        }
        return false;
    }




    private static boolean isValidTicket(String ticket) {

       if (ticket.length() == 20){
           return true;
       }else {
           return false;
       }



    }


}






