package TextProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        while (!word.equals("end")){
            String reversWord = "";
            for (int i = word.length() - 1; i >= 0 ; i--) {
                char symbol = word.charAt(i);
                reversWord = reversWord + symbol;

            }
            System.out.printf("%s = %s%n", word, reversWord);


            word = scanner.nextLine();
        }
    }
}
