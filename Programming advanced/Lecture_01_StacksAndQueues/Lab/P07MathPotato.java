package Lecture_01_StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                                .collect(Collectors.toList());

                int hotPotatoIndex = Integer.parseInt(scanner.nextLine());


        int cycle = 0;
        int countMovePotato = 0;
        int startIndex = 0;
        while (input.size() > 1){
            int range = hotPotatoIndex;
            String toPrint = "";
                    for (int i = startIndex; i < range ; i++) {

                        if (i == input.size()){
                            range -= input.size();
                            i = 0;
                            cycle ++;
                        }
                        if (i == range - 1){
                            startIndex = i;
                            toPrint = input.get(i);
                        }
                    }
                    if (isPrimeCycle(cycle)){
                        System.out.println("Prime " + toPrint);

                    }else {
                        String removePlayer = input.remove(startIndex);
                        System.out.println("Removed " + removePlayer );

                    }


                }
                System.out.println("Last is " + input.get(0));
            }

    private static boolean isPrimeCycle(int cycle) {
        if (cycle == 0){
            return false;
        }
        for (int i = 2; i < cycle ; i++) {
            if (cycle % i == 0){
                return false;
            }
        }
        return true;



    }
}



