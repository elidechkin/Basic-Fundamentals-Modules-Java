package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptedText = new StringBuilder();

        for (int position = 0; position <= text.length() - 1 ; position++) {
            char symbol = text.charAt(position);// вземаме всеки чар на текущата позиция
            char encriptedSymbol = (char) (symbol + 3);

            encryptedText.append(encriptedSymbol);

        }
        System.out.println(encryptedText);
    }
}
