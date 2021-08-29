package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age >= 16) {
            // mr or ms
            if (gender.equalsIgnoreCase("m")) {
                System.out.println("Mr.");
            } else {
                System.out.println("Ms.");
            }


        } else {
            //miss or Mister
            if (gender.equalsIgnoreCase("m")) {
                System.out.println("Master");
            } else {
                System.out.println("Miss");
            }

        }
    }
}