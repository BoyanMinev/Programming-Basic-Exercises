package ExamExercises.Exam15And16June2019;

import java.util.Scanner;

public class P04MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetForActors = Double.parseDouble(scanner.nextLine());
        double totalSalary = 0;
        String input = scanner.nextLine();
        boolean isEnough = true;
        while(!input.equals("ACTION")){




            if (input.length() > 15) {

                budgetForActors -= budgetForActors * 0.2;
            }

            else {
                double salaryActor = Double.parseDouble(scanner.nextLine());
                budgetForActors -= salaryActor;


            }

            if (budgetForActors <= 0){
                isEnough = false;
                break;
            }


            input = scanner.nextLine();
        }
        double diff = Math.abs(budgetForActors);
        if (!isEnough){
            System.out.printf("We need %.2f leva for our actors.", diff);
        }else{
            System.out.printf("We are left with %.2f leva.", diff);
        }

    }
}
