package L05WhileLoop.Lab;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            String command = scanner.nextLine();

            if (command.equals("Stop")){

                break;
            }
            System.out.println(command);
        }
    }
}
