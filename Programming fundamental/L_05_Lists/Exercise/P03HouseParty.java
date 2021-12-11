package L_05_Lists.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCommands = Integer.parseInt(scanner.nextLine());

        List <String> listPeopleOnHouseParty = new ArrayList();
        for (int i = 0; i < countCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            if (command[2].equals("going!")){
                String name = command[0];

               if (checkListForThatName(name, listPeopleOnHouseParty)){
                   System.out.println(name + " is already in the list!");
               }else{
                   listPeopleOnHouseParty.add(name);
               }

            }else if (command[2].equals("not")){
                String name = command[0];
                if(checkListForThatName(name, listPeopleOnHouseParty)){
                    listPeopleOnHouseParty.remove(name);
                }else{
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (int i = 0; i < listPeopleOnHouseParty.size(); i++) {
            System.out.println(listPeopleOnHouseParty.get(i));
        }
    }

    private static boolean checkListForThatName(String name, List<String> listPeopleOnHouseParty) {
       boolean onTheLIst = false;
        for (int i = 0; i < listPeopleOnHouseParty.size(); i++) {
            if (name.equals(listPeopleOnHouseParty.get(i))){
                onTheLIst = true;
            }
        }

        return onTheLIst;
    }


}
