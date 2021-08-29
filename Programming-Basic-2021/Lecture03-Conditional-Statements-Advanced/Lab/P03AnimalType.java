package L03ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfAnimal = scanner.nextLine();

        if (typeOfAnimal.equalsIgnoreCase("dog")) {
            System.out.println("mammal");


        }
        else if (typeOfAnimal.equalsIgnoreCase("crocodile")) {

            System.out.println("reptile");
        }
        else if (typeOfAnimal.equalsIgnoreCase("tortoise")) {
            System.out.println("reptile");
        }
        else if (typeOfAnimal.equalsIgnoreCase("snake")) {
            System.out.println("reptile");
        } else {
            System.out.println("unknown");
        }

    }
}

