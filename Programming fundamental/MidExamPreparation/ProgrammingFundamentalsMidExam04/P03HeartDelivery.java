package MidExamPreparation.ProgrammingFundamentalsMidExam04;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> heartsOfNeighborhood = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int currentIndex = 0;
        int countValentineHouse = 0;
        while (!input.equals("Love!")) {
            String[] command = input.split(" ");
            if (command[0].equals("Jump")) {
                int length = Integer.parseInt(command[1]);
                if ((currentIndex + length) > heartsOfNeighborhood.size() - 1) {
                    currentIndex = 0;
                    if (heartsOfNeighborhood.get(0) == 0) {
                        System.out.printf("Place %d already had Valentine's day.", currentIndex);
                        System.out.println();
                    }else {
                        heartsOfNeighborhood.set(0, heartsOfNeighborhood.get(0) - 2);

                        if (heartsOfNeighborhood.get(currentIndex) == 0) {
                            System.out.printf("Place %d has Valentine's day.", currentIndex);
                            System.out.println();

                        }
                    }
                } else {
                    currentIndex += length;

                    if (heartsOfNeighborhood.get(currentIndex) == 0) {
                        System.out.printf("Place %d already had Valentine's day.", currentIndex);
                        System.out.println();
                    } else {

                        heartsOfNeighborhood.set(currentIndex, heartsOfNeighborhood.get(currentIndex) - 2);

                        if (heartsOfNeighborhood.get(currentIndex) == 0) {
                            System.out.printf("Place %d has Valentine's day.", currentIndex);
                            System.out.println();

                        }
                    }
                }

            }
            input = scanner.nextLine();

        }
        System.out.printf("Cupid's last position was %d.", currentIndex);
        System.out.println();
        for (int i = 0; i < heartsOfNeighborhood.size(); i++) {
            if (heartsOfNeighborhood.get(i) == 0){
                countValentineHouse ++;
            }
        }
        if (heartsOfNeighborhood.size() == countValentineHouse){
            System.out.println("Mission was successful.");
        }else {

            System.out.printf("Cupid has failed %d places.", heartsOfNeighborhood.size() - countValentineHouse);
        }





    }
}

