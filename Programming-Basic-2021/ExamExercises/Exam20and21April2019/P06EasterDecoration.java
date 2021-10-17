package ExamExercises.Exam20and21April2019;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numClients = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;
        for (int i = 0; i < numClients; i++) {

            String input = scanner.nextLine();
            double totalPriceForClient = 0;
            int numItems = 0;
            while (!input.equals("Finish")){



                numItems ++;

               if (input.equalsIgnoreCase("basket")){
                   totalPriceForClient +=1.50;
               }else if (input.equalsIgnoreCase("wreath")){
                   totalPriceForClient+= 3.80;
               }else if (input.equalsIgnoreCase("chocolate bunny")){
                   totalPriceForClient += 7;
               }





                input = scanner.nextLine();
            }
            if (numItems % 2 == 0){
                totalPriceForClient *= 0.80;
            }

            totalSum += totalPriceForClient;
            System.out.printf("You purchased %d items for %.2f leva.%n", numItems, totalPriceForClient);
        }
        double averageSumForClients = totalSum / numClients;

        System.out.printf("Average bill per client is: %.2f leva.", averageSumForClients);
    }
}
