package L_07_MapsLambdaAndStreamAPI.Ecercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String username = "";
        String licenseNumber = "";
        Map<String, String> registerCars = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("register")){
                 username = command[1];
                 licenseNumber = command[2];
                 if(registerCars.containsKey(username)){
                     System.out.printf("ERROR: already registered with plate number %s%n", registerCars.get(username));
                 }else {
                     registerCars.put(username, licenseNumber);
                     System.out.printf("%s registered %s successfully%n", username, registerCars.get(username));
                 }
            }else {
                username = command[1];

                if (!registerCars.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n", username);
                }else {
                    registerCars.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        registerCars.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " => " +
                e.getValue()));
    }
}
