package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class LowerorUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (letter >= 'a' && letter <= 'z'){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }

    }
}
