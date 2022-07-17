package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String res = "";

        char firstOccur = input.charAt(0);
        res += firstOccur;

        for (int i = 1; i < input.length(); i++) {//обхождаме редицата
            char currentSymbol = input.charAt(i); //вземаме всеки символ
            if (currentSymbol != firstOccur) {// ако символа е различен, г
                res += currentSymbol;//го добавяме към празния стринг
                firstOccur = currentSymbol;
            }

        }

        System.out.println(res);
    }
}
