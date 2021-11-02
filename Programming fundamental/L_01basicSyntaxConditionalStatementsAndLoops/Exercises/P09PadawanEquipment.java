package L_01basicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double neededMoney = ((Math.ceil(countOfStudents * 1.10)) * priceOfLightSabers) + (countOfStudents * priceOfBelts) + (countOfStudents * priceOfRobes);
        int discount = countOfStudents / 6;
        neededMoney -= discount * priceOfBelts;
        double diff = Math.abs(neededMoney - amountMoney);

        if (neededMoney <= amountMoney){

            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
