package L_05_Lists.MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.stream(scanner.nextLine().split(""))
                        .collect(Collectors.toList());

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).charAt(0) > 47 && text.get(i).charAt(0) < 58){

                numbers.add(Integer.parseInt(text.get(i)));
                text.remove(i);
                i= -1;

            }
        }
        List<String> result = new ArrayList<>();

        int index = 0;
        int indexSkip = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0){
                for (int j = index; j < index + numbers.get(i) ; j++) {
                    result.add(text.get(j));
                }
                index += numbers.get(i);
            }else {
                indexSkip = index;
                for (int j = indexSkip; j < indexSkip + numbers.get(i) ; j++) {

                  index ++;
                }
            }
        }
        System.out.println(String.join("",result));
    }
}
