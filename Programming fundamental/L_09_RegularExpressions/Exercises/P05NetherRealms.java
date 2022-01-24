package L_09_RegularExpressions.Exercises;



import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        List<String> demons = Arrays.stream(scanner.nextLine().split("[, ]+"))
                .sorted(String::compareTo)
                        .collect(Collectors.toList());

        for (String demon : demons) {
            String regexHealth = "([^\\d+*\\/.-])";

            String regexDamage = "(-?\\d+\\.?\\d*)";
            String regexOperation = "([*\\/])";

            Pattern patternHealth = Pattern.compile(regexHealth);
            Pattern patternDamage = Pattern.compile(regexDamage);
            Pattern patternOperation = Pattern.compile(regexOperation);
            Matcher matcher = patternHealth.matcher(demon);
            int health = 0;
            double damage = 0;

            while (matcher.find()) {

                health += matcher.group(1).charAt(0);
            }
            matcher = patternDamage.matcher(demon);
            while (matcher.find()) {


                damage += Double.parseDouble(matcher.group(1));



            }
            matcher = patternOperation.matcher(demon);
            while (matcher.find()){
                if (matcher.group(1).equals("*")){
                    damage *= 2;
                }else if (matcher.group().equals("/")){
                    damage /= 2;
                }
            }


            System.out.printf("%s - %d health, %.2f damage%n", demon, health, damage);



        }



        }


}
