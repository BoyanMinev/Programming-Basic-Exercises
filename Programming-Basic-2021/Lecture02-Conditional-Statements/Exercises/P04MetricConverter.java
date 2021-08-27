package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P04MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        //Превръщаме input в метри

        if (input.equals("mm")) {
            num = num / 1000;
        } else if (input.equals("cm")) {
            num = num / 100;
        }

        //Конвертиране на input -> output

        if (output.equals("mm")){
            num = num * 1000;
        }else if (output.equals("cm")){
            num = num * 100;
        }
        System.out.printf("%.3f", num);
    }
}
