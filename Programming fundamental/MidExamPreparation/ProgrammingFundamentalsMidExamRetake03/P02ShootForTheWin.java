package MidExamPreparation.ProgrammingFundamentalsMidExamRetake03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        String input = scanner.nextLine();
        int countShots = 0;

        while(!input.equals("End")){

            int index = Integer.parseInt(input);

            if (index > targets.size() - 1 || index < 0 || targets.get(index) == -1){
                input = scanner.nextLine();
                continue;
            }else {

                for (int i = 0; i < targets.size(); i++) {
                    if (i != index && targets.get(i) != -1){

                        if (targets.get(i) <= targets.get(index)){
                            targets.set(i, targets.get(i) + targets.get(index));
                        }else {
                            targets.set(i, targets.get(i) - targets.get(index));
                        }
                    }
                }
                targets.set(index, -1);
                countShots ++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countShots);
        System.out.print(targets.toString().replaceAll("[\\[\\],]",""));

    }
}
