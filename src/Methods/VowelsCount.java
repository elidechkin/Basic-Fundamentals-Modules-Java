package Methods;


import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        System.out.println(printCountOfVowes(text));


    }
    private static int printCountOfVowes(String text) {
        int count = 0;
        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'o' ||
                    symbol == 'u' || symbol == 'i') {
                count++;
            }

        }
        return count;
    }
}
