package TextProcessing;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();


        int start = (int) Math.min(first,second);
        int end = (int) Math.max(first,second);


        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
           int currentChar = (int)(text.charAt(i));

           if(currentChar > start && currentChar < end){
               sum += currentChar;
           }
      }
       System.out.println(sum);




    }
}
