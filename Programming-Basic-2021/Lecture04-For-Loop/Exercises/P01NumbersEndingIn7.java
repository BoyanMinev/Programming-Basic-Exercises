package L04ForLoop.Exercises;

import java.util.Scanner;

public class P01NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        for (int i = 7; i <=997 ; i++) {
            if (i % 10 == 7){
                System.out.println(i);
            }

        }
    }
}
