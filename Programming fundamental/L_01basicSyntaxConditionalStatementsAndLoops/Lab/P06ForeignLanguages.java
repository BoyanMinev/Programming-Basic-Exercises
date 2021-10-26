package L_01basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class P06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String language;

        if (country.equalsIgnoreCase("USA") || country.equalsIgnoreCase("England")){
            language = "English";
        }else if (country.equalsIgnoreCase("Spain") || country.equalsIgnoreCase("Mexico") || country.equalsIgnoreCase("Argentina")){
            language = "Spanish";
        }else {
            language = "unknown";
        }
        System.out.println(language);
    }
}
