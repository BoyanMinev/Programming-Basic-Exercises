package L_03ARRAYS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String inputLine = "1 2 3 5 17";
        String[] items = inputLine.split(" ");

        int[] arr = Arrays.stream(items)
              .mapToInt(e -> Integer.parseInt(e)).toArray();


    }
}
