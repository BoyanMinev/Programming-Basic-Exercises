package L01FirstSpepsInCoding.Lab;

import java.util.Scanner;

public class P06ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String secondName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",name,secondName,age,city);
    }
}
