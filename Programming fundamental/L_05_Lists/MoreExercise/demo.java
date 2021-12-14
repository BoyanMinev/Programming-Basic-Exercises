package L_05_Lists.MoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
            .map(Integer::parseInt).collect(Collectors.toList());
    String message = scanner.nextLine();

       for (int i= 0; i <= numbers.size() - 1; i++){
        int currentNumber = numbers.get(i);
        int index = CalculateIndex(currentNumber);


        char currentChar = GetCharFromMessage(index, message);
        System.out.println(currentChar);
        int realIndex = CalculateRealIndex(index, message);
    }
        System.out.println();
}
    static int CalculateIndex(int number)
    {
        int index = 0;
        while (number > 0)
        {
            int currentNumber = number % 10;
            index += currentNumber;
            number /= 10;
        }

        return index;
    }
    static char GetCharFromMessage(int index,String message)
    {
        int countIndex = 0;

        for (int i = 0; i < index; i++)
        {
            countIndex++;

            if (countIndex == message.length()){
                countIndex = 0;
            }
        }

        char currentChar = message.charAt(countIndex);
        return currentChar;
    }
    static int CalculateRealIndex(int index, String message)
    {
        int countIndex = 0;

        for (int i = 0; i < index; i++)
        {
            countIndex++;

            if (countIndex == message.length())
            {
                countIndex = 0;
            }
        }
        return countIndex;
    }

}


