package L_07_MapsLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).sorted((num1 ,num2) -> num2.compareTo(num1))
                .collect(Collectors.toList());
        int count = 0;
        for (Integer number : sorted) {
            count ++;
            if (count > 3){
                break;
            }else {
                System.out.print(number + " ");
            }

        }
    }
}
