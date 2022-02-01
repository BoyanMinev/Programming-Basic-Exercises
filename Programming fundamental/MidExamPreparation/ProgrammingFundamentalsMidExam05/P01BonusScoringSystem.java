package MidExamPreparation.ProgrammingFundamentalsMidExam05;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        int countLecturesInCourse = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = Double.NEGATIVE_INFINITY;
        double currentBonus = 0;
        int attendanceCurrentStudent = 0;
        if (countLecturesInCourse > 0) {
            for (int i = 0; i < countStudents; i++) {
                int attendanceStudent = Integer.parseInt(scanner.nextLine());
                currentBonus = 1.0 * attendanceStudent / countLecturesInCourse * (5 + bonus);
                if (currentBonus > maxBonus) {
                    maxBonus = currentBonus;
                    attendanceCurrentStudent = attendanceStudent;

                }


            }
        }
        maxBonus = Math.ceil(maxBonus);

            if (countStudents > 0 && countLecturesInCourse > 0) {
                System.out.printf("Max Bonus: %.0f.%n" +
                        "The student has attended %d lectures.", maxBonus, attendanceCurrentStudent);
            }
    }
}
