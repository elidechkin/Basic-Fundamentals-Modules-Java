package WhileLoopLab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String imputpassword = scanner.nextLine();

        while (!imputpassword.equals(password)){
            imputpassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", username);
    }
}
