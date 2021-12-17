package L_06_ObjectAndClasses.BigFactorial;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Factarial factarial = new Factarial(n);

        System.out.println(factarial.result());
    }
}
