package L_02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class P01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("END")){
            int countDigit =0;
            int countBoolean =0;
            int countString = 0;

            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);

                if (symbol == 46){
                    System.out.printf("%s is floating point type%n", input);
                    i = input.length();
                }else  if (input.equals("false") || input.equals("true") ){
                    System.out.printf("%s is boolean type%n", input);
                    i = input.length();

                }else if ((symbol >= 48 && symbol <= 57) || symbol == 45){
                    countDigit ++;
                    if (countDigit == input.length()){
                        System.out.printf("%s is integer type%n", input);
                    }
                }else if (input.length() == 1 && symbol >= 33 && symbol <= 126){
                    System.out.printf("%s is character type%n", input);
                }else {
                    countString ++;
                    if (countString == 1) {
                        System.out.printf("%s is string type%n", input);
                    }
                }

            }

            input = scanner.nextLine();
        }
    }
}
