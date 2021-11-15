package L_02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class P05BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isOpenBracket = false;
        boolean isCloseBracket = false;
        boolean isBalancedPair = false;

        for (int i = 0; i < n; i++) {
            int countOpenBracket = 0;
            int countCloseBracket = 0;

            String input = scanner.nextLine();
            char symbol;
            if (input.length() == 1){
                symbol = input.charAt(0);
                if (symbol == 40){
                    if (isOpenBracket) {
                        System.out.println("UNBALANCED");
                        return;
                    }else if (isCloseBracket){
                        isBalancedPair = true;
                        isCloseBracket = false;
                        isOpenBracket = false;
                    }else {
                        isOpenBracket = true;
                        isBalancedPair = false;
                    }
                }else if (symbol == 41){
                    if (isCloseBracket){
                        System.out.println("UNBALANCED");
                        return;
                    }else if (isOpenBracket){
                        isBalancedPair = true;
                        isCloseBracket = false;
                        isOpenBracket = false;
                    }else {
                        isCloseBracket = true;
                        isBalancedPair = false;
                    }
                }
            }else {
                for (int j = 0; j < input.length(); j++) {
                    symbol = input.charAt(j);

                    if (symbol == 40 ){
                        countOpenBracket ++;
                        if (countOpenBracket == 2){
                            System.out.println("UNBALANCED");
                            return;
                        }
                    }else if(symbol == 41){
                        countCloseBracket ++;
                        if (countCloseBracket == 2){
                            System.out.println("UNBALANCED");
                            return;
                        }
                    }
                }
            }
        }
        if (isBalancedPair){
            System.out.println("BALANCED");
        }else {
            System.out.println("UNBALANCED");
        }
    }
}
