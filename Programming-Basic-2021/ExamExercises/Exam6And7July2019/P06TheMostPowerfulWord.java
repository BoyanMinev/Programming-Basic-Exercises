package ExamExercises.Exam6And7July2019;

import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxSymbolSum = Integer.MIN_VALUE;
        int symbolSum = 0;
        String mostPowerfulWord = "";

        while(!input.equals("End of words")){
            boolean isHaveAVowel = false;
            boolean isHaveACapitalVowel = false;
            for (int i = 0; i < input.length(); i++) {

                char symbol = input.charAt(0 + i);

                symbolSum += symbol;
                if ((input.charAt(0)) == 97 || (input.charAt(0)) == 101 || (input.charAt(0)) == 105 || (input.charAt(0)) == 111
                        || (input.charAt(0)) == 117 || (input.charAt(0)) == 121 || (input.charAt(0)) == 65 || (input.charAt(0)) == 69 || (input.charAt(0)) == 73 || (input.charAt(0)) == 79 || (input.charAt(0)) == 85
                        || (input.charAt(0)) == 89){
                    isHaveAVowel = true;

                }
            }
            if (isHaveAVowel){
                symbolSum *= input.length();
            }else{
                symbolSum /= input.length();
            }
            if (symbolSum > maxSymbolSum){
                maxSymbolSum = symbolSum;
                mostPowerfulWord = input;
            }
            symbolSum = 0;


            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d",mostPowerfulWord, maxSymbolSum);
    }
}
