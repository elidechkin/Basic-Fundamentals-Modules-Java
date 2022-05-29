package MoreExe;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String comand = scanner.nextLine();
        boolean isFoundO = false;
        boolean isFoundC = false;
        boolean isFoundN = false;
        String word = "";

        while (!comand.equals("End")){
            char letter = comand.charAt(0);
            if (letter < 'A' || ( letter > 'Z' && letter < 'a') || letter > 'z'){
                comand = scanner.nextLine();
                continue;
            }
            if ("c".equals(comand)&& !isFoundC){
                isFoundC = true;
            }else if ("o".equals(comand)&& !isFoundO){
                isFoundO = true;
            }else if ("n".equals(comand)&& !isFoundN){
                isFoundN = true;
            }else {
                word += comand;
            }
            if (isFoundC && isFoundN && isFoundO){
                isFoundO = false;
                 isFoundC = false;
                 isFoundN = false;
                System.out.print(word + " ");
                word = "";

            }

            comand = scanner.nextLine();
        }
    }
}
