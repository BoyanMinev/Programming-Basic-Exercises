package L05WhileLoop.Lab;

import java.util.Scanner;

public class P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String password = scanner.nextLine();
        String input;
        do {
            input = scanner.nextLine();

        }while(!input.equals(password));

                System.out.printf("Welcome %s!", name);

        }
        }


