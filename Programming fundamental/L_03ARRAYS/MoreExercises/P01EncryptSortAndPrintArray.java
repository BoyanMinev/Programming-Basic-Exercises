package L_03ARRAYS.MoreExercises;

import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int[] output = new int[n];
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int number1 = 0;
            int number2 = 0;
            int sum = 0;
            String input = scanner.nextLine();
                for (int j = 0; j < input.length(); j++) {
                    char symbol = input.charAt(j);

                    if (symbol == 65 || symbol == 97 || symbol == 69 || symbol == 101 ||
                            symbol == 73 || symbol == 105 || symbol == 79 || symbol == 111 ||
                            symbol == 85 || symbol == 117 || symbol == 89 ){
                        number1 = symbol * input.length();
                        sum += number1;
                    }else if( (symbol > 64 && symbol < 91) || (symbol > 96 && symbol < 123)){
                        number2 = symbol / input.length();
                        sum += number2;
                    }

                }
            numbers[i] = sum;
        }
        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] > maxValue) {
                maxValue = numbers[k];
            }
        }
            for (int o = 0; o < numbers.length; o++) {
                if (numbers[o] < minValue){
                    minValue = numbers[o];
                }
            }

        int countIndex = minValue;
        for (int h = 0; h < numbers.length; h++) {

            label:
            for (int i = countIndex; i <= maxValue; i++) {

                for (int j = 0; j < numbers.length; j++) {
                    if (i == numbers[j]) {
                            output[h] = i;
                            countIndex = i + 1;
                            break label;
                    }
                }
            }
        }

        for (int exit :
                output) {
            System.out.println(exit);
        }
    }
}
