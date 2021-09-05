package L03ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmOfMonth = Double.parseDouble(scanner.nextLine());
        double salaryWithoutTaxes = 0.0;
        double salaryTruckDriver = 0.0;

        if (kmOfMonth <= 5000){
            if (season.equalsIgnoreCase("Spring") || season.equalsIgnoreCase("Autumn")){
                salaryWithoutTaxes = (kmOfMonth * 0.75) * 4;
                salaryTruckDriver = salaryWithoutTaxes - salaryWithoutTaxes * 0.1;

            }
            else if (season.equalsIgnoreCase("Summer")){
                salaryWithoutTaxes = (kmOfMonth * 0.9) * 4;
                salaryTruckDriver = salaryWithoutTaxes - salaryWithoutTaxes * 0.1;
            }
            else if (season.equalsIgnoreCase("Winter")){
                salaryWithoutTaxes = (kmOfMonth * 1.05) * 4;
                salaryTruckDriver = salaryWithoutTaxes - salaryWithoutTaxes * 0.1;

            }
        }
        else if (kmOfMonth > 5000 && kmOfMonth <= 10000){

            if (season.equalsIgnoreCase("Spring") || season.equalsIgnoreCase("Autumn")){
                salaryWithoutTaxes = (kmOfMonth * 0.95) * 4;
                salaryTruckDriver = salaryWithoutTaxes - salaryWithoutTaxes * 0.1;
            }
            else if (season.equalsIgnoreCase("Summer")){
                salaryWithoutTaxes = (kmOfMonth * 1.1) * 4;
                salaryTruckDriver = salaryWithoutTaxes - salaryWithoutTaxes * 0.1;
            }
            else if (season.equalsIgnoreCase("Winter")){
                salaryWithoutTaxes = (kmOfMonth * 1.25) * 4;
                salaryTruckDriver = salaryWithoutTaxes - salaryWithoutTaxes * 0.1;
            }
        }
        else {
            if (season.equalsIgnoreCase("Spring") || season.equalsIgnoreCase("Autumn") ||
                    season.equalsIgnoreCase("Summer") || season.equalsIgnoreCase("Winter") ){
                salaryWithoutTaxes = (kmOfMonth * 1.45) * 4;
                salaryTruckDriver = salaryWithoutTaxes - salaryWithoutTaxes * 0.1;
            }
        }
        System.out.printf("%.2f", salaryTruckDriver);
    }
}
