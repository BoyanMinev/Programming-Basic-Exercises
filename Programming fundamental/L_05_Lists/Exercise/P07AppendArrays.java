package L_05_Lists.Exercise;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(list);
        System.out.println(list.toString().replace("[", "")
        .replace("]", "")
        .replace(",", "")
        .trim()
        .replaceAll("\\s+", " "));





    }
}