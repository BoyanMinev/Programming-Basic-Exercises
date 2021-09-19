package L05WhileLoop.Lab;

import java.util.Scanner;

public class P08Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counter = 1;
        double totalGrade = 0.0;
        int fails = 0;
       boolean isFailedMoreThanOnce = false;
        while(counter <= 12){
            double grade = Double.parseDouble(scanner.nextLine());

            if(grade >= 4.00){
                counter++;
                totalGrade+= grade;
                continue;
            }
            totalGrade += grade;

            fails++;
            if(fails > 1){
                isFailedMoreThanOnce = true;
                break;
            }
        }
        if (isFailedMoreThanOnce){

            System.out.printf(" %s has been excluded at %d grade", name, counter);
        }else{
            double averageGrade = totalGrade /12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);
        }



    }
}
