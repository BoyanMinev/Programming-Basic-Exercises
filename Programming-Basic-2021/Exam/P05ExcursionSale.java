package Exam;

import java.util.Scanner;

public class P05ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numExcursionsSea = Integer.parseInt(scanner.nextLine());
        int numExcursionsMountain = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalSum = 0;
        boolean isNoMorePacket = false;

        while(!input.equals("Stop")){

            if (input.equalsIgnoreCase("sea")){
                if (numExcursionsSea != 0){
                    numExcursionsSea --;
                    totalSum += 680;
                }
            }else if (input.equalsIgnoreCase("mountain")){
                if (numExcursionsMountain != 0){
                    numExcursionsMountain --;
                    totalSum += 499;
                }
            }
            if (numExcursionsMountain == 0 && numExcursionsSea == 0){

                isNoMorePacket = true;
                break;
            }


            input = scanner.nextLine();
        }
        if (isNoMorePacket){
            System.out.println("Good job! Everything is sold.");

        }
        System.out.printf("Profit: %d leva.", totalSum);
    }
}
