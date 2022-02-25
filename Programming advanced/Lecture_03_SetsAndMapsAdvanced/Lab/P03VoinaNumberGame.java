package Lecture_03_SetsAndMapsAdvanced;




import java.util.*;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeckOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondDeckOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int roundsOfGame = 50;
        while(roundsOfGame -- > 0 && !firstDeckOfNumbers.isEmpty() && !secondDeckOfNumbers.isEmpty()){
           Iterator<Integer> firstDeckIterator = firstDeckOfNumbers.iterator();
           Iterator<Integer> secondDeckIterator = secondDeckOfNumbers.iterator();


            int firstCard = firstDeckIterator.next();
            int secondCard = secondDeckIterator.next();
            firstDeckOfNumbers.remove(firstCard);
            secondDeckOfNumbers.remove(secondCard);

            if (firstCard > secondCard){
                firstDeckOfNumbers.add(firstCard);
                firstDeckOfNumbers.add(secondCard);
            }else if(secondCard > firstCard){
                secondDeckOfNumbers.add(firstCard);
                secondDeckOfNumbers.add(secondCard);
            }


        }
        if (firstDeckOfNumbers.size() > secondDeckOfNumbers.size()){
            System.out.println("First player win!");
        }else if (secondDeckOfNumbers.size() > firstDeckOfNumbers.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw!");
        }
    }

}
