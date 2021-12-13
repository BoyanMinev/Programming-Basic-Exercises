package L_05_Lists.Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String inputCommand = scanner.nextLine();
        while(!inputCommand.equals("3:1")){
            String[] command = inputCommand.split("\\s+");

            if (command[0].equals("merge")){

                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if (startIndex < 0){
                    startIndex = 0;
                }if (endIndex > input.size() - 1){
                    endIndex = input.size() - 1;
                }
                if (isValidIndex(startIndex,input)) {
                    mergeElements(startIndex, endIndex, input);
                }

            }else if (command[0].equals("divide")){
                int divideIndex = Integer.parseInt(command[1]);
                int partitions = Integer.parseInt(command[2]);
                String divideObject = input.get(divideIndex);
                input.remove(divideIndex);
                if (divideObject.length() % partitions == 0){
                    int begin = 0;
                    for (int i = 0; i < partitions; i++) {
                        input.add(divideIndex + i, divideObject.substring(begin, begin + divideObject.length()/partitions));
                        begin += divideObject.length()/partitions;
                    }
                }else if (divideObject.length() % partitions != 0){
                    int begin = 0;
                    for (int i = 0; i < partitions - 1; i++) {
                        input.add(divideIndex + i, divideObject.substring(begin, begin + divideObject.length()/ partitions));
                   begin += divideObject.length()/partitions;
                    }
                    input.add(divideIndex + partitions - 1, divideObject.substring(begin, divideObject.length() ));
                }
            }


                inputCommand = scanner.nextLine();


        }
        System.out.println(input.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean isValidIndex(int startIndex, List<String> input) {

        return startIndex < input.size() - 1;
    }

    private static void mergeElements(int startIndex, int endIndex, List<String> input) {

        StringBuilder merge = new StringBuilder();
        for (int i = startIndex; i <= endIndex ; i++) {
            merge.append(input.get(i));
        }
        for (int i = startIndex; i <= endIndex ; i++) {
          input.remove(startIndex);
        }
        input.add(startIndex, merge.toString());

    }
}
