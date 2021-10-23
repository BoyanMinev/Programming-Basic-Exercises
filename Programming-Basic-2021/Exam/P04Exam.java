package Exam;

import java.util.Scanner;

public class P04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudentsAppeared = Integer.parseInt(scanner.nextLine());
        int countTopStudents = 0;
        int countStudentsGood  = 0;
        int countStudentsMedium = 0;
        int countStudentsFail = 0;
        double sumGrade = 0;
        for (int i = 0; i < numOfStudentsAppeared; i++) {

            double gradeOfExam = Double.parseDouble(scanner.nextLine());

            if (gradeOfExam >= 5.00){
                countTopStudents ++;
            }else if (gradeOfExam < 5.00 && gradeOfExam >= 4.00){
                countStudentsGood++;
            }else if (gradeOfExam < 4.00 && gradeOfExam >= 3.00){
                countStudentsMedium++;
            }else {
                countStudentsFail++;
            }
            sumGrade +=gradeOfExam;
        }
        double percentageTopStudents = 1.0 * countTopStudents / numOfStudentsAppeared * 100;
        double percentageGoodStudents = 1.0 * countStudentsGood / numOfStudentsAppeared * 100;
        double percentageMediumStudents = 1.0 * countStudentsMedium / numOfStudentsAppeared * 100;
        double percentageFailStudents = 1.0 * countStudentsFail / numOfStudentsAppeared * 100;
        double averageGradeOfAllStudents = sumGrade / numOfStudentsAppeared;

        System.out.printf("Top students: %.2f%%\n" +
                "Between 4.00 and 4.99: %.2f%%\n" +
                "Between 3.00 and 3.99: %.2f%%\n" +
                "Fail: %.2f%%\n" +
                "Average: %.2f", percentageTopStudents, percentageGoodStudents, percentageMediumStudents,
                percentageFailStudents, averageGradeOfAllStudents);
    }
}
