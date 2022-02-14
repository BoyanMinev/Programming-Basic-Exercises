package Lecture_01_StacksAndQueues.Exercises;

import java.util.*;
import java.util.stream.Collectors;

public class P10PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());


        boolean isDiedPlant = true;
        int countDays = 0;
        while (isDiedPlant){
        isDiedPlant = false;


            for (int i = numbers.size() - 1; i > 0 ; i--) {
                int quantityOfPesticideRight = numbers.get(i);

                if (quantityOfPesticideRight <= numbers.get(i - 1)) {


                } else {
                    isDiedPlant = true;
                    numbers.remove(i);

                }

            }

            if (isDiedPlant){
                countDays ++;
            }


        }
        System.out.println(countDays);

    }
}
