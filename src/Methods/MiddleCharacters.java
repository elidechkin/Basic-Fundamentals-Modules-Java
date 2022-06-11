package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);


    }
    private static void printMiddleChar(String text){
        if (text.length() % 2 == 1){
            System.out.println(text.charAt(text.length() /2));
        }else{
            int indexFirstMiddleChar = text.length() /2 - 1;
            int indexSecondMiddleChar = text.length() /2;

            System.out.println(text.charAt(indexFirstMiddleChar) + "" + text.charAt(indexSecondMiddleChar));
        }


    }


}
