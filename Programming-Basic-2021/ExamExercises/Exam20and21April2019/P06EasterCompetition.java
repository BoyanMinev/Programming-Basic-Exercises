package ExamExercises.Exam20and21April2019;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEasterCakes = Integer.parseInt(scanner.nextLine());

        int maxGrade = Integer.MIN_VALUE;
        String nameBakerMaxPoint = "";

        for (int i = 0; i < numEasterCakes; i++) {
            String nameBaker = scanner.nextLine();
            String input = scanner.nextLine();
            int sumPoint = 0;
            while(!input.equals("Stop")){

                int grade = Integer.parseInt(input);

                sumPoint += grade;

                input = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", nameBaker, sumPoint);
            if (sumPoint > maxGrade){
                maxGrade = sumPoint;
                nameBakerMaxPoint = nameBaker;

                System.out.printf("%s is the new number 1!%n", nameBaker);

            }
        }
        System.out.printf("%s won competition with %d points!", nameBakerMaxPoint, maxGrade );
    }
}
