package Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles {
    //характеристики -> полета
    private String title;
    private String content;
    private String author;

    // конструктор -> създаваме обекти
    public Articles(String title, String content, String author){
        //създаваме нов обект от класа Артикъл със същите параметри
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //функционалности -> методи
    public void edit(String newContent){
        this.content = newContent;
    }
    public void changeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void rename(String newTitle){
        this.title  = newTitle;
    }

    public String toString(){
        return this.title + " - " + this.content + ": " + this.author;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleDate = scanner.nextLine();

        String title = articleDate.split(", ")[0];
        String content = articleDate.split(", ")[1];
        String author = articleDate.split(", ")[2];

        Articles currentArticle = new Articles(title, content, author);


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n ; i++) {
            String command = scanner.nextLine();
            String commandName = command.split("\\: ")[0];
            String newValue = command.split("\\: ")[1];

            switch (commandName){
                case "Edit":
                    currentArticle.edit(newValue);
                    break;
                case "ChangeAuthor":
                    currentArticle.changeAuthor(newValue);
                    break;
                case "Rename":
                    currentArticle.rename(newValue);
                    break;
            }

        }
        System.out.println(currentArticle.toString());

    }
}
