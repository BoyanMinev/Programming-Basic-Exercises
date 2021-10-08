package ExamExercises.Exam9and10March2019;

import java.util.Scanner;

public class P03Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String country = scanner.nextLine();
            String typeInstrument = scanner.nextLine();

            double grade = 0;

            if (typeInstrument.equalsIgnoreCase("ribbon")){

                switch (country){

                    case "Russia":
                        grade = 9.100 + 9.400;
                        break;
                    case "Bulgaria":
                        grade = 9.600 + 9.400;
                        break;
                    case "Italy":
                        grade = 9.200 + 9.500;
                        break;
                }
            }else if (typeInstrument.equalsIgnoreCase("hoop")){
                switch (country){

                    case "Russia":
                        grade = 9.300 + 9.800;
                        break;
                    case "Bulgaria":
                        grade = 9.550 + 9.750;
                        break;
                    case "Italy":
                        grade = 9.450 + 9.350;
                        break;
                }
            }else if (typeInstrument.equalsIgnoreCase("rope")){

                switch (country){

                    case "Russia":
                        grade = 9.600 + 9.000;
                        break;
                    case "Bulgaria":
                        grade = 9.500 + 9.400;
                        break;
                    case "Italy":
                        grade = 9.700 + 9.150;
                        break;
                }
            }
            double percentageDiffGrade = (20 - grade) /0.2;

        System.out.printf("The team of %s get %.3f on %s.%n", country, grade, typeInstrument);
        System.out.printf("%.2f%%", percentageDiffGrade);
    }
}
