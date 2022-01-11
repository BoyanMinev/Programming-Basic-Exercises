package L_07_MapsLambdaAndStreamAPI.MoreExercises;



import java.util.*;

public class P05DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String , Map<String, List<Integer>>> dragons = new LinkedHashMap<>();
        Map<String , List<Double>> typeStats = new LinkedHashMap<>();



        for (int i = 0; i < n; i++) {


            String[] data = scanner.nextLine().split("\\s+");

            String type = data[0];
            String name = data[1];
            int health;
            int damage;
            int armor;
            if (data[3].equals("null")){
                health = 250;
            }else {
                health = Integer.parseInt(data[3]);
            }
            if (data[2].equals("null")){
                damage = 45;
            }else {
                damage = Integer.parseInt(data[2]);
            }
            if (data[4].equals("null")){
                armor = 10;
            }else {
                armor = Integer.parseInt(data[4]);
            }

            if(!dragons.containsKey(type)){
                dragons.put(type, new LinkedHashMap<>());
            }
            dragons.get(type).put(name , new ArrayList<>());
            dragons.get(type).get(name).add(damage);
            dragons.get(type).get(name).add(health);
            dragons.get(type).get(name).add(armor);
            if(!typeStats.containsKey(type)){
                typeStats.put(type , new ArrayList<>());
            }

            if (typeStats.get(type).size() > 0) {

                typeStats.get(type).set(0, typeStats.get(type).get(0) + damage);
                typeStats.get(type).set(1, typeStats.get(type).get(1) + health);
                typeStats.get(type).set(2, typeStats.get(type).get(2) + armor);
            }else {
                typeStats.get(type).add((double) damage);
                typeStats.get(type).add((double) health);
                typeStats.get(type).add((double) armor);
            }
        }

        typeStats.entrySet().forEach(e -> {

            e.getValue().set(0, e.getValue().get(0) / dragons.get(e.getKey()).size());
            e.getValue().set(1, e.getValue().get(1) / dragons.get(e.getKey()).size());
            e.getValue().set(2, e.getValue().get(2) / dragons.get(e.getKey()).size());

        });
        typeStats.forEach((key, value) -> {
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", key, value.get(0),
                    value.get(1), value.get(2));

            dragons.get(key).entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(s -> {

                        System.out.print("-" + s.getKey() + " -> ");
                        String armor = String.valueOf(s.getValue().get(2));
                        String health = String.valueOf(s.getValue().get(1));
                        String damage = String.valueOf(s.getValue().get(0));
                        String stats = String.format("damage: %s, " +
                                        "health: %s, armor: %s", damage,
                                health, armor);
                        System.out.println(stats);

                    });


        });




    }
}
