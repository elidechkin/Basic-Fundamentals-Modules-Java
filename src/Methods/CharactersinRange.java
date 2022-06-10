package Methods;

import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printCharactersRange(start, end);



    }



    private static void printCharactersRange(char start, char end){
        if (start < end){
            for (int i = start +1 ; i < end; i++) {
                char symbol = (char) i;
                System.out.print(symbol + " ");
            }
        }else {
            for (int i = end +1 ; i < start; i++) {
                char symbol = (char) i;
                System.out.print(symbol + " ");
        }


        }
    }

}
