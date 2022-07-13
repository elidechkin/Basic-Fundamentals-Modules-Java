package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordsArr) {
            if (text.contains(banWord)){
                text = text.replace(banWord, "*".repeat(banWord.length()));
            }
        }

        System.out.println(text);
    }
}

