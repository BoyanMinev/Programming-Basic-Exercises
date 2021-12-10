package L_05_Lists.Lab;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> foods = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            foods.add(scanner.nextLine());
        }
        Collections.sort(foods);
        for (int i = 1; i <= foods.size(); i++) {
            System.out.printf("%d.%s%n", i, foods.get(i -1));

        }
    }
}
