package L_05_Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<String> message = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        String output= "";
        for (int i = 0; i < numbers.size(); i++) {
            int element = numbers.get(i);
            int sum = 0;

            while (element != 0){
                int digit = element % 10;
                element /= 10;
                sum += digit;
            }
            int letterIndex = sum % message.size();

            output += message.get(letterIndex);
            message.remove(letterIndex);
        }
        System.out.println(output);

        }

}
