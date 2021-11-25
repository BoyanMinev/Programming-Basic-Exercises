package L_03ARRAYS;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Pesho", "Gosho", "Sasho"};

        for (String currentName :
                names) {
            System.out.println(currentName);
            System.out.println("");
        }
    }
}
