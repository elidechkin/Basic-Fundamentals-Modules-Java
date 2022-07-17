package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        int totalStrenght = 0;

        for (int position = 0; position < text.length() ; position++) {
            char currentSymbol = text.charAt(position);
            if (currentSymbol == '>'){
                int currentStrenght = Integer.parseInt(text.charAt(position +1) + "");
                totalStrenght += currentStrenght;

            }else if (currentSymbol != '>' && totalStrenght > 0){
                text.deleteCharAt(position);
                totalStrenght --;
                position --;
            }
        }
        System.out.println(text);
    }
}
