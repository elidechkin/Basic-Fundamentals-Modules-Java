package DataTypeVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //power
        int m = Integer.parseInt(scanner.nextLine()); //distance
        int y = Integer.parseInt(scanner.nextLine()); //factor

        int count = 0;
        int entryN = n;

        while ( n >= m){
            n -= m;
            count ++;

            if (n == entryN * 0.50){
                if (y > 0){
                    n /= y;
                }
            }
        }

        System.out.println(n);
        System.out.println(count);
    }
}
