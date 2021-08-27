package L02ConditionalStatements.Exercises;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totalInSeconds = first+second+third;

        int minutes = totalInSeconds / 60;
        int sec = totalInSeconds % 60;

        if (sec < 10){
            System.out.printf("%d:0%d",minutes, sec);
        }else {
            System.out.printf("%d:%d", minutes, sec);
        }
    }
}
