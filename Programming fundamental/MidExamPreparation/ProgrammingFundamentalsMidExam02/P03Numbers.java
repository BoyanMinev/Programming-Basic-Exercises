package MidExamPreparation.ProgrammingFundamentalsMidExam02;

import java.util.*;

import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                        .collect(Collectors.toList());
           double averageValueOfSequence = averageValueList(numbers);
           List<Integer> newSequence = new ArrayList<>();
           sequenceOfNumbersBiggerThanAverageValue(numbers, averageValueOfSequence, newSequence);
           sortDescendentingOrderList(newSequence);

           if (newSequence.size() == 0){
               System.out.println("No");
           }else{
               System.out.println(newSequence.toString().replaceAll("[\\[\\],]", ""));
           }
    }

    private static void sortDescendentingOrderList(List<Integer> newSequence) {
        Collections.sort(newSequence);
        Collections.reverse(newSequence);
        for (int i = 0; i < newSequence.size(); i++) {
            if (i > 4){
                newSequence.remove(i);
                i --;
            }
        }
    }

    private static void sequenceOfNumbersBiggerThanAverageValue(List<Integer> numbers, double averageValueOfSequence, List<Integer> newSequence) {
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > averageValueOfSequence){

                newSequence.add(numbers.get(i));

            }
        }
    }

    private static double averageValueList(List<Integer> numbers) {
        
        double sumList = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sumList += numbers.get(i);
        }
        return sumList / numbers.size();
    }
}
