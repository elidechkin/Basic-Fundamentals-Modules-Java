package BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a >= b && b >= c){
            System.out.printf("%d%n%d%n%d%n", a, b, c);
            return;
        }
        if ( a >= c && c >= b){
            System.out.printf("%d%n%d%n%d%n", a, c, b);
            return;
        }
        if (b >= a && a >= c){
            System.out.printf("%d%n%d%n%d%n", b, a, c);
            return;
        }
        if ( b >= c && c >= a){
            System.out.printf("%d%n%d%n%d%n", b, c, a);
            return;
        }
        if (c >= a && a >= b) {
                System.out.printf("%d%n%d%n%d%n", c, a, b);
                return;
            }
        if (c >= b && b >= a){
            System.out.printf("%d%n%d%n%d%n", c, b, a);

        }

    }
}
