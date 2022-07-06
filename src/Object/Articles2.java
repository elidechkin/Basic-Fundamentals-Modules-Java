package Object;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    private String getTitle() {
        return title;
    }

    private String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    String title;
    String content;
    String author;

    private Articles2(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s%n", this.title, this.content, this.author);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Articles2> articles = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String title = input[0];
            String content = input[1];
            String author = input[2];

            Articles2 article = new Articles2 (title, content, author);
            articles.add(article);
        }
        String command = scanner.nextLine();
        if (command.equals("title")) {
            articles.sort(Comparator.comparing(Articles2::getTitle).reversed());
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("content")) {
            articles.sort(Comparator.comparing(Articles2::getContent).reversed());
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("author")) {
            articles.sort(Comparator.comparing(Articles2::getAuthor).reversed());
            System.out.print(articles.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
