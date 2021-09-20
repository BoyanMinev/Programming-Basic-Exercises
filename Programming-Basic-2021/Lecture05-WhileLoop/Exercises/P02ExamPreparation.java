package L05WhileLoop.Exercises;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());

        String problemName = scanner.nextLine();
        int poorGrades = 0;
        boolean isFaild = false;
        double allGradesSum = 0;
        int allGrades = 0;
        String lastProblem = "";

        while (!problemName.equals("Enough")){
            int grade = Integer.parseInt(scanner.nextLine());
            allGrades++;
            allGradesSum += grade;

            if (grade <= 4){
                poorGrades++;
                if (poorGrades == poorGradesLimit){
                    lastProblem = problemName;
                    isFaild = true;
                    break;
                }
            }

            lastProblem = problemName;
            problemName = scanner.nextLine();
        }
        double averageScore = allGradesSum / allGrades;
        String output = "";

        if (isFaild){
            output = String.format("You need a break, %d poor grades.", poorGrades);

        }else {
            output = String.format("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", averageScore, allGrades, lastProblem );

        }
        System.out.println(output);
    }
}
