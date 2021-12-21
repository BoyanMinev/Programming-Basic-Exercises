package L_06_ObjectAndClasses.Exercises.Articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputDate = Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());
        String title = inputDate.get(0);
        String content = inputDate.get(1);
        String author = inputDate.get(2);
        Article article = new Article(title, content, author);
           int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(":\\s+");
            String command = data[0];
            String commandContent = data[1];

            switch (command){
                case "Edit" :
                    article.setContent(commandContent);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(commandContent);
                    break;
                case "Rename":
                    article.setTitle(commandContent);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
