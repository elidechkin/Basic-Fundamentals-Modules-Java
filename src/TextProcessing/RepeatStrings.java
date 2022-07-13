package TextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArr = scanner.nextLine().split(" ");

        List<String> concatArr = new ArrayList<>();

        for (int i = 0; i < stringArr.length; i++) {
            String  currentWord = stringArr[i];
            int len = currentWord.length();

            for (int j = 0; j < len; j++) {
                concatArr.add(currentWord);

            }

        }
        System.out.println(String.join("", concatArr));
    }
}
