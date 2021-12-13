package L_05_Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> distancePokemon = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                        .collect(Collectors.toList());
        int sumRemovedElements = 0;
        int valueOfIndex = 0;
           while(!(distancePokemon.size() == 0)){

               int index = Integer.parseInt(scanner.nextLine());
               if (index < 0){
                   valueOfIndex = distancePokemon.remove(0);
                   distancePokemon.add(0, distancePokemon.get(distancePokemon.size() - 1));
               }else if (index > distancePokemon.size() - 1){
                   valueOfIndex = distancePokemon.remove(distancePokemon.size() - 1);
                   distancePokemon.add(distancePokemon.get(0));

               }else{

                   valueOfIndex = distancePokemon.remove(index);
               }
               sumRemovedElements += valueOfIndex;

               for (int i = 0; i < distancePokemon.size(); i++) {
                   if (distancePokemon.get(i) <= valueOfIndex){
                       increaseCommand(distancePokemon, i, valueOfIndex);
                   }else if (distancePokemon.get(i) > valueOfIndex){
                       decreaseCommand(distancePokemon, i, valueOfIndex);
                   }
               }
           }
        System.out.println(sumRemovedElements);
    }

    private static void decreaseCommand(List<Integer> distancePokemon, int i, int valueOfIndex) {
        distancePokemon.set(i, distancePokemon.get(i) - valueOfIndex);
    }

    private static void increaseCommand(List<Integer> distancePokemon, int i, int valueOfIndex) {
        distancePokemon.set(i, distancePokemon.get(i) + valueOfIndex);
    }
}
