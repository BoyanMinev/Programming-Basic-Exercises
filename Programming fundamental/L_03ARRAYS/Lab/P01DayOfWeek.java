package L_03ARRAYS.Lab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

       int n = Integer.parseInt(scanner.nextLine());
       if (n < 1 || n > 7){
           System.out.println("Invalid day!");
       }else {

           System.out.printf("%s", days[n - 1]);
       }

    }
}
