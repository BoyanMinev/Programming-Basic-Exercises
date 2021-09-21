package L05WhileLoop.Exercises;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        int coins = 0;
        double sumINCents = Math.floor(sum * 100);

        while(sumINCents != 0){

            if (sumINCents >= 200){
                sumINCents -=200;
            }else if (sumINCents >= 100){
                sumINCents -= 100;
            }else if (sumINCents >= 50){
                sumINCents -= 50;
            }else if (sumINCents >= 20){
                sumINCents -= 20;
            }else if (sumINCents >= 10) {
                sumINCents -= 10;
            }else if (sumINCents >= 5){
                sumINCents -= 5;
            }else if(sumINCents >= 2){
              sumINCents -= 2;
            }
            else if (sumINCents >= 1){
                sumINCents -= 1;
            }
            coins++;


        }
        System.out.println(coins);
    }
}
