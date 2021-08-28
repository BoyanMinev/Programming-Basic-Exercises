package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P08Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double avgScore = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0.0;
        double excellentScholarship = 0.0;

        boolean isApproved = false;

        String output = "";
        //Проверка за социална стипендия

        if (income < minSalary){
            if (avgScore > 4.5){

                socialScholarship = Math.floor(minSalary * 0.35);
                isApproved = true;

            }

        }
        //проверка за отлична стипендия

        if (avgScore >= 5.50){
            excellentScholarship = Math.floor(avgScore * 25);
            isApproved = true;



        }
        //Изход

        //Проверка коя стипендия е по висока
        if (socialScholarship>excellentScholarship){
            output = String.format("You get a Social scholarship %.0f BGN", socialScholarship);
        }else {
            output = String.format("You get a scholarship for excellent results %.0f BGN", excellentScholarship);

        }

        if (!isApproved){
            output = "You cannot get a scholarship!";
        }

        //Print
        System.out.println(output);
    }
}
