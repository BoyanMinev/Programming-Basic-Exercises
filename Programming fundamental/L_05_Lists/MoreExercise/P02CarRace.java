package L_05_Lists.MoreExercise;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        double firstCar = 0;
        double secondCar = 0;

        for (int i = 0; i < numbers.size() / 2; i++) {
            if (numbers.get(i) == 0) {
                firstCar = firstCar * 0.8;
            }
            firstCar += numbers.get(i);
        }
        Collections.reverse(numbers);
        for (int i = 0; i < numbers.size() / 2; i++) {
            if (numbers.get(i) == 0) {
                secondCar = secondCar * 0.8;
            }
            secondCar += numbers.get(i);
        }
        if (firstCar < secondCar) {
            System.out.printf("The winner is left with total time: %.1f", firstCar);
        } else if (secondCar < firstCar) {
            System.out.printf("The winner is right with total time: %.1f", secondCar);
        }
    }
}


