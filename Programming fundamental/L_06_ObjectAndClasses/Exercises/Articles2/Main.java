package L_06_ObjectAndClasses.Exercises.Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Article2> dataArticle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String title = input.split(",\\s+")[0];
            String content = input.split(",\\s+")[1];
            String author = input.split(",\\s+")[2];
            Article2 article = new Article2(title, content, author);
            dataArticle.add(article);
        }
        String comparingContent = scanner.nextLine();
        switch (comparingContent) {
            case "title":
                dataArticle.sort(Comparator.comparing(Article2::getTitle));
                break;
            case "content":
                dataArticle.sort(Comparator.comparing(Article2::getContent));
                break;
            case "author":
                dataArticle.sort(Comparator.comparing(Article2::getAuthor));
                break;
        }
        for (Article2 article :
                dataArticle) {
            System.out.println(article.toString());

        }
    }
}
