package L05WhileLoop.Exercises;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length  = Integer.parseInt(scanner.nextLine());

        int totalPeaceOfCake = width * length;
        boolean isEaten = false;
        int neededCakes = 0;
        String input = scanner.nextLine();

        while(!input.equals("STOP")){
            int numCake = Integer.parseInt(input);
            totalPeaceOfCake -= numCake;

            if (totalPeaceOfCake <= 0){
                isEaten = true;
               break;
            }


            input = scanner.nextLine();

        }
        String output = "";

        if (isEaten){
            output = String.format("No more cake left! You need %d pieces more.", Math.abs(totalPeaceOfCake));

        }else {
            output = String.format("%d pieces are left.", totalPeaceOfCake);
        }
        System.out.println(output);
    }
}
