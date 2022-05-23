package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);
            password += currentSymbol;
        }

        int countFailed = 0;
        String input = scanner.nextLine();

        while (!input.equals(password)) {
            countFailed ++;
            if (countFailed == 4){
                System.out.printf("User %s blocked!", userName);
                break;
                //return - прекратява цялата програма, а break  само цикъла.
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }

        if (input.equals(password)){
            System.out.printf("User %s logged in.", userName);
        }



    }
}
