package L_06_ObjectAndClasses.Exercises.Articles2;

public class Article2 {
    private String title;
    private String content;
    private String author;


    public Article2(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }
    //Article - content: Johnny
    @Override
    public String toString(){
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
