package P06NestedLoops.Exercises;

import java.util.Scanner;

public class P06SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1111; i <= 9999; i++) {
            int countNum = 0;
            int currentNum = 0;
            int num = i;
            for (int j = 0; j < 4; j++) {
                currentNum = num % 10;
                num /= 10;
                if (currentNum == 0){
                    continue;
                }
                if ((n % currentNum) == 0){
                    countNum++;
                    if (countNum == 4) {
                        System.out.printf("%d ", i);
                    }

                }else{
                    break;
                }



            }

        }
    }
}
