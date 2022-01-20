package L_08_TextProcessing.MoreExercises;

import java.util.Scanner;

public class P05HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titleOfAnArticle = scanner.nextLine();
        String contentOfAnArticle = scanner.nextLine();
        String input = scanner.nextLine();
        System.out.printf("<h1>\n" +
                "    %s\n" +
                "</h1>\n", titleOfAnArticle);
        System.out.printf("<article>\n" +
                "    %s\n" +
                "</article>\n", contentOfAnArticle);
        while(!input.equals("end of comments")){
            System.out.printf("<div>\n" +
                    "    %s\n" +
                    "</div>\n", input);


            input = scanner.nextLine();
        }
    }
}
