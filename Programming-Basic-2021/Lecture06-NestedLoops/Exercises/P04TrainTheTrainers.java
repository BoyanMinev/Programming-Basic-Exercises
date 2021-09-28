package P06NestedLoops.Exercises;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countGrades = 0;
        double gradesSum = 0;
        String text = scanner.nextLine();

        while (!text.equals("Finish")){
            double currentSumGrades = 0;
            for (int i = 0; i < n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradesSum+=grade;
                countGrades++;
                currentSumGrades += grade;


            }
            double averageGrade = currentSumGrades / n;
            System.out.printf("%s - %.2f.%n", text, averageGrade);



            text = scanner.nextLine();
        }
        double averageAllGrades = gradesSum / countGrades;
        System.out.printf("Student's final assessment is %.2f.", averageAllGrades);
    }
}
