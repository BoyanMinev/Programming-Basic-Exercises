package Exam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());
        double totalExperience = 0;
        int battlesCount = 0;
        boolean isReach = false;
        for (int i = 1; i <= countOfBattles; i++) {
            double currentBattleExperience = Double.parseDouble(scanner.nextLine());
            totalExperience = totalExperience + currentBattleExperience;

            if (i % 3 == 0){
                totalExperience = totalExperience + (currentBattleExperience * 0.15);
            }if (i % 5 == 0){
                totalExperience = totalExperience - (currentBattleExperience * 0.10);
            }if (i % 15 == 0){
                totalExperience = totalExperience + (currentBattleExperience * 0.05);
            }
            battlesCount ++;
            if (totalExperience >= neededExperience){
                isReach = true;
                break;
            }

        }
        if (isReach){
            System.out.printf("Player successfully collected his needed experience for %d battles.", battlesCount);
        }else {
            double neededExperienceToReach = neededExperience - totalExperience;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperienceToReach);
        }
    }
}
