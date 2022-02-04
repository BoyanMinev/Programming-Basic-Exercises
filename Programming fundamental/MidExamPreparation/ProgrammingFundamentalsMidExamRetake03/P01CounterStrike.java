package MidExamPreparation.ProgrammingFundamentalsMidExamRetake03;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int countBattles = 0;
        while(!input.equals("End of battle")){
            int distance = Integer.parseInt(input);
            if (initialEnergy > 0 && initialEnergy >= distance){
                    countBattles ++;
                    initialEnergy -= distance;
                    if (countBattles % 3 == 0){
                        initialEnergy += countBattles;
                    }



            }else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countBattles, initialEnergy);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", countBattles, initialEnergy);
    }
}
