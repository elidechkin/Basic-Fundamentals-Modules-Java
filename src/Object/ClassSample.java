package Object;

public class ClassSample {
    //характеристики -> полета
    private String title;
    private String content;
    private String author;

    //конструктор -> създаваме обекти
    public ClassSample(String title, String content, String author){
        //нов обект - празен е, ще подаваме стойности за всеки нов обект
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //функционалности -> методи
    public void edit (String newContent){
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void rename(String newTitle){
        this.title = newTitle;
    }
}
