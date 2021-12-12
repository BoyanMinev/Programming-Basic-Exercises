package L_05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        int[] specialNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
       int bombNumber = specialNumbers[0];
       int bombPower = specialNumbers[1];
       int bombIndex = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bombNumber){
                bombIndex = i;
                int startDelete = bombIndex - bombPower;
                int finishDelete = bombIndex + bombPower;
                if (startDelete < 0){
                    startDelete = 0;
                }else if (finishDelete > numbers.size() - 1){
                    finishDelete = numbers.size() - 1;
                }
                for (int j = startDelete; j <= finishDelete ; j++) {
                    numbers.remove(startDelete);
                }
                i = -1;
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
          sum += numbers.get(i);
        }
        System.out.println(sum);

    }
}
