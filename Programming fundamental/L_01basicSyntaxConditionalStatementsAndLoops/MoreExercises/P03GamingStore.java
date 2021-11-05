package L_01basicSyntaxConditionalStatementsAndLoops.MoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double totalBalance = currentBalance;
        while(!input.equals("Game Time")){
            if (input.equalsIgnoreCase("OutFall 4")){
                currentBalance -= 39.99;
                if (currentBalance < 0){
                    currentBalance += 39.99;
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                }else {
                    System.out.println("Bought OutFall 4");
                }
            }else if (input.equalsIgnoreCase("CS: OG")){
                currentBalance -= 15.99;
                if (currentBalance < 0){
                    currentBalance += 15.99;
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                }else {
                    System.out.println("Bought CS: OG");
                }
            }else if (input.equalsIgnoreCase("Zplinter Zell")){
                currentBalance -= 19.99;
                if (currentBalance < 0){
                    currentBalance += 19.99;
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                }else {
                    System.out.println("Bought Zplinter Zell");
                }
            }else if (input.equalsIgnoreCase("Honored 2")){
                currentBalance -= 59.99;
                if (currentBalance < 0){
                    currentBalance += 59.99;
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                }else {
                    System.out.println("Bought Honored 2");
                }
            }else if (input.equalsIgnoreCase("RoverWatch")){
                currentBalance -= 29.99;
                if (currentBalance < 0){
                    currentBalance += 29.99;
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                }else {
                    System.out.println("Bought RoverWatch");
                }
            }else if (input.equalsIgnoreCase("RoverWatch Origins Edition")){
                currentBalance -= 39.99;
                if (currentBalance < 0){
                    currentBalance += 39.99;
                    System.out.println("Too Expensive");
                    input = scanner.nextLine();
                    continue;
                }else {
                    System.out.println("Bought RoverWatch Origins Edition");
                }
            }else{
                System.out.println("Not Found");
                input = scanner.nextLine();
                continue;
            }
            if (currentBalance == 0){
                System.out.println("Out of money!");
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalBalance - currentBalance, currentBalance);
    }
}
