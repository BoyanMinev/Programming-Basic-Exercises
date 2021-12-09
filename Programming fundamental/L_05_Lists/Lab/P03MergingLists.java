package L_05_Lists.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = Math.min(numbers1.size() , numbers2.size());
           splitListsAndPrint(numbers1, numbers2);
           restOfNumbers(numbers1, size);
           restOfNumbers(numbers2, size);

    }

    private static void restOfNumbers(List<Integer> numbers, int size) {


        for (int i = size; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }

    private static void splitListsAndPrint(List<Integer> numbers1, List<Integer> numbers2) {
        int size = Math.min(numbers1.size() , numbers2.size());
        for (int i = 0; i < size; i++) {
            System.out.print(numbers1.get(i) + " " + numbers2.get(i) + " ");
        }
    }
}

