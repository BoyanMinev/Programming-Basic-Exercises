package MidExamPreparation.ProgrammingFundamentalsMidExamRetake01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int moves = 0;
        boolean isDone = false;
        while (!input.equals("end")) {

            List<Integer> matchingElements = Arrays.stream(input.split(" ")).map(Integer::parseInt)
                    .collect(Collectors.toList());
            if ((matchingElements.get(1) <= numbers.size() - 1 && matchingElements.get(1) >= 0) && (matchingElements.get(0) <= numbers.size() - 1 && matchingElements.get(0) >= 0) &&
                    matchingElements.get(0) != matchingElements.get(1)) {

                if ((numbers.get(matchingElements.get(0)).equals(numbers.get(matchingElements.get(1))))){
                    moves++;
                    int a = 0;
                    int b = 0;
                    if (matchingElements.get(0) < matchingElements.get(1)) {
                        a = matchingElements.get(0);
                        b = matchingElements.get(1);
                    } else {
                        a = matchingElements.get(1);
                        b = matchingElements.get(0);
                    }

                    String matchElement = numbers.get(matchingElements.get(0));
                    numbers.remove(a);
                    numbers.remove(b - 1);
                    System.out.printf("Congrats! You have found matching elements - %s!", matchElement);
                    System.out.println();
                }else{

                    System.out.println("Try again!");
                }
            } else {
                moves ++;
                numbers.add(numbers.size() / 2, String.format("-%da", moves));
                numbers.add(numbers.size() / 2, String.format("-%da", moves));
                System.out.println("Invalid input! Adding additional elements to the board");
                moves --;
            }
            input = scanner.nextLine();
            if ((numbers.size() == 0)){
                System.out.printf("You have won in %d turns!", moves);
                isDone = true;
                break;
            }
        }
        if (isDone){

        }else{

            if (numbers.size() == 0){
                System.out.printf("You have won in %d turns!", moves);
            }else {
                System.out.println("Sorry you lose :(");
                System.out.println(String.join(" ",numbers));
            }
        }

    }
}


