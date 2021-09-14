package L04ForLoop.MoreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int numP1 = 0;

        int numP2 = 0;

        int numP3 = 0;

        int numP4 = 0;

        double gradeSum = 0.0;

        for (int i = 0; i < n; i++) {

            double gradeStudent = Double.parseDouble(scanner.nextLine());
            gradeSum += gradeStudent;
            if (gradeStudent >= 5.00){
                numP1 ++;

            }else if (gradeStudent >= 4.00){
                numP2 ++;

            }else if (gradeStudent >= 3.00){
                numP3 ++;

            }else{
                numP4 ++;

            }

        }

       double p1 = (1.0 * numP1 / n) * 100;
       double p2 = (1.0 * numP2 / n) * 100;
       double p3 = (1.0 * numP3 / n) * 100;
       double p4 = (1.0 * numP4 / n) * 100;
       double averageGrade = gradeSum / n;

        System.out.printf("Top students: %.2f%%\n" +
                "Between 4.00 and 4.99: %.2f%%\n" +
                "Between 3.00 and 3.99: %.2f%%\n" +
                "Fail: %.2f%%\n" +
                "Average: %.2f", p1, p2, p3, p4, averageGrade);
    }

}
