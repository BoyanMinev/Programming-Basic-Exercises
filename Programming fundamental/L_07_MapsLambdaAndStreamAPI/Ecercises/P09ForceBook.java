package L_07_MapsLambdaAndStreamAPI.Ecercises;



import java.util.*;


public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> forceUsers = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {


            if (input.contains("|")){
                String forceSide = input.split("\\s+\\|\\s+")[0];
                String forceUser = input.split("\\s+\\|\\s+")[1];


                forceUsers.putIfAbsent(forceSide, new ArrayList<>());
                boolean isExistUser = false;
                for (List<String> name: forceUsers.values()) {
                    if (name.contains(forceUser)){
                        isExistUser = true;
                    }
                }
                if (!isExistUser){
                    forceUsers.get(forceSide).add(forceUser);
                }

            } else {
                String[] data = input.split(" -> ");
                String forceSide = input.split("\\s+->\\s+")[1];
                String forceUser = input.split("\\s+->\\s+")[0];
                boolean isExistUser = false;


                forceUsers.entrySet().forEach(e-> e.getValue().remove(forceUser));
                forceUsers.putIfAbsent(forceSide, new ArrayList<>());
                forceUsers.get(forceSide).add(forceUser);


                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);






            }
            input = scanner.nextLine();
        }

        forceUsers.entrySet().stream().sorted((e1 , e2) -> {
            int sortedResult = Integer.compare(e2.getValue().size() , e1.getValue().size());
            if (sortedResult == 0){
                sortedResult = e1.getKey().compareTo(e2.getKey());
            }
            return sortedResult;
        }).forEach(e -> {
            for (Map.Entry <String, List<String>> entry  : forceUsers.entrySet()) {
                Collections.sort(entry.getValue());

            }
                        if (e.getValue().size() > 0) {
                            System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                            for (String name : e.getValue()) {
                                System.out.println("! " + name);
                            }
                        }

                });
    }
}

