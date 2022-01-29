package MidExamPreparation.ProgrammingFundamentalsMidExam02;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employer1EfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int employer2EfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int employer3EfficiencyPerHour = Integer.parseInt(scanner.nextLine());
        int numOfStudents = Integer.parseInt(scanner.nextLine());

        int allEmployeesEfficiencyPerHour = employer1EfficiencyPerHour + employer2EfficiencyPerHour
                + employer3EfficiencyPerHour;
        int countDay = 0;
        if (numOfStudents == 0){
            System.out.println("Time needed: 0h.");
        }
        while(numOfStudents > 0) {
            for (int i = 1; i <= 24; i++) {
                if (i % 4 == 0) {
                    continue;
                } else {
                    numOfStudents -= allEmployeesEfficiencyPerHour;
                }
                if (numOfStudents <= 0) {
                    System.out.printf("Time needed: %dh.", i + (24 * countDay));
                    break;
                }
            }
            countDay ++;
        }
    }
}
