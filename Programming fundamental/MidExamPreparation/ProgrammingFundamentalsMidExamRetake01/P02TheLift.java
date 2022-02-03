package MidExamPreparation.ProgrammingFundamentalsMidExamRetake01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeopleInTheQueue = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
           ;

        for (int i = 0; i < wagons.size(); i++) {
            for (int j = 0; j < 4; j++) {

                if (wagons.get(i) < 4 && numOfPeopleInTheQueue > 0) {
                    wagons.set(i, wagons.get(i) + 1);
                    numOfPeopleInTheQueue--;
                }
            }
        }





        if (wagons.get(wagons.size() - 1) < 4){
            System.out.println("The lift has empty spots!");
            for (int numbers :
                    wagons) {
                System.out.print(numbers + " ");
            }
        }else if (numOfPeopleInTheQueue > 0){
            System.out.printf("There isn't enough space! %d people in a queue!", numOfPeopleInTheQueue);
            System.out.println();
            for (int numbers :
                    wagons) {
                System.out.print(numbers + " ");
            }
        }else if(wagons.get(wagons.size() - 1) == 4 && numOfPeopleInTheQueue == 0 ){
            for (int numbers :
                    wagons) {
                System.out.print(numbers + " ");
            }
        }
        }
    }

