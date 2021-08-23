package L01FirstSpepsInCoding.Exercises;

import java.util.Scanner;

public class P06CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на вход
        int numDaysCampaignRuns = Integer.parseInt(scanner.nextLine());
        int numOfConfectioners = Integer.parseInt(scanner.nextLine());
        int numOfCake = Integer.parseInt(scanner.nextLine());
        int numOfWaffles = Integer.parseInt(scanner.nextLine());
        int numOfPancakes = Integer.parseInt(scanner.nextLine());
        //Пресмятания
        double profitCakes = numOfCake * 45;
        double profitWaffles = numOfWaffles * 5.80;
        double profitPancakes = numOfPancakes * 3.20;

        double totalSumFromAllConfectioners = (profitCakes + profitWaffles + profitPancakes) * numOfConfectioners;
        double totalSumCampaign = totalSumFromAllConfectioners * numDaysCampaignRuns;
        double sumWithoutCosts = totalSumCampaign - (totalSumCampaign * 1 / 8);
        //Принтиране на резултат
        System.out.printf("%.2f" ,sumWithoutCosts);

    }
}
