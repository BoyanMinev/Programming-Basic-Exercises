package L04ForLoop.Exercises;

import java.util.Scanner;

public class P04Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        String output = "";
        boolean isLostSalary = false;

        for (int i = 0; i < tabs; i++) {
            String tab = scanner.nextLine();

           switch(tab){
               case "Facebook":
                   salary -= 150;
                   break;
               case "Instagram":
                   salary -= 100;
                   break;
               case "Reddit":
                   salary -= 50;
                   break;
           }


            if (salary <= 0) {
                isLostSalary = true;
                break;
            }
        }
        if (isLostSalary) {
            output = "You have lost your salary.";


        }else {
            output = String.format("%d", salary);

        }
        System.out.println(output);
    }
}
