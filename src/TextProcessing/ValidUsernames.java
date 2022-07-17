package TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни
        String input = scanner.nextLine();
        String[] userNames = input.split(", ");

        // 2. проверка за юзърнейма
        for (String userName:userNames) {
            if (isValid(userName)){
                System.out.println(userName);
            }

        }
    }
    public static boolean isValid (String userName) {
        //1. проверка за дължината
        if (userName.length() < 3 || userName.length() > 16) {
            return false;
        }
        for (char symbol: userName.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                return false;
            }
        }
       return true;
    }

}
