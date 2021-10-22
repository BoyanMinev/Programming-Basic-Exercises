package ExamExercises.Exam28And29March2020;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacityTrunkAirplane = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();

        double totalVolume = 0;
        int countSuitcaseLoad = 0;
        boolean isLoadAll = true;
        int countSuitcases = 0;
        while(!input.equals("End")){

            double volumeSuitcase = Double.parseDouble(input);
            countSuitcases ++;
            if (countSuitcases % 3 == 0) {
                volumeSuitcase *= 1.1;
            }
            capacityTrunkAirplane-= volumeSuitcase;

            if (capacityTrunkAirplane < 0){
                isLoadAll = false;
                break;
            }else {
                countSuitcaseLoad++;
            }



            input = scanner.nextLine();
        }
        if (!isLoadAll){
            System.out.println("No more space!");
        }else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", countSuitcaseLoad);
    }
}
