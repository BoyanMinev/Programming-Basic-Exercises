package L_05_Lists.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        removeNegativeNumbersAndPrintList(numbers);
    }

    private static void removeNegativeNumbersAndPrintList(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < 0){
                numbers.remove(i);
                i = -1;
            }
        }
        if (numbers.size() == 0){
            System.out.println("empty");
        }else {
            Collections.reverse(numbers);
            for (int output :
                    numbers) {
                System.out.print(output + " ");
            }
        }
    }

}
