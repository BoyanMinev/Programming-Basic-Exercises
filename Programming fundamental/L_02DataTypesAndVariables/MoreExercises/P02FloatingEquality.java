package L_02DataTypesAndVariables.MoreExercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class P02FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.nextLine();
        String n2 = scanner.nextLine();
        BigDecimal number1 = new BigDecimal(n1);
        double num1 = Double.parseDouble(n1);
        BigDecimal number2 = new BigDecimal(n2);
        double num2 = Double.parseDouble(n2);
        BigDecimal result = new BigDecimal(0);

        double eps = 0.000001;
        String output = "";

       if (num1 > num2){
           result =result.add(number1);
           result =result.subtract(number2);
           double resultDouble = result.doubleValue();

           if (resultDouble > eps){
               output = "False";
           }else {
               output = "True";
           }

       }else {
           result =result.add(number2);
           result =result.subtract(number1);
           double resultDouble = result.doubleValue();
           if (resultDouble >= eps){
               output = "False";
           }else {
               output = "True";
           }
       }
        System.out.println(output);






    }
}
