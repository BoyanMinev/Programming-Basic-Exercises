package L_08_TextProcessing.MoreExercises;

import java.util.Scanner;

public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String [] data = scanner.nextLine().split("\\s+");
            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();
            boolean isFoundName = false;
            boolean isFoundAge = false;
            for (int j = 0; j < data.length; j++) {

                if(data[j].charAt(0) == '@'){
                    if (data[j].charAt(data[j].length() - 1) == '|' ) {
                        name = new StringBuilder(data[j]);
                        name.deleteCharAt(0);
                        name.deleteCharAt(name.length() - 1);
                        isFoundName = true;
                    }


                }if (data[j].charAt(0) == '#'){
                    if (data[j].charAt(data[j].length() - 1) == '*') {
                        age = new StringBuilder(data[j]);
                        age.deleteCharAt(0);
                        age.deleteCharAt(age.length() - 1);
                        isFoundAge = true;
                    }
                }

            }
            if(isFoundName && isFoundAge) {
                System.out.printf("%s is %s years old.%n", name, age);
            }


        }


    }
}
