package L_02DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int countPokes = 0;
        double percentage50OfPokePower = pokePowerN / 2.0;
        while(pokePowerN >= distanceM){
            pokePowerN -= distanceM;
            countPokes ++;
            if (pokePowerN == percentage50OfPokePower){
                if (exhaustionFactorY != 0) {
                    pokePowerN /= exhaustionFactorY;
                }
            }
        }
        System.out.printf("%d%n" +
                "%d", pokePowerN, countPokes);
    }
}
