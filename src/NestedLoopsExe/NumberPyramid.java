package NestedLoopsExe;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
         boolean isFalse = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ( current > n){
                    isFalse = true;
                    break;
                }
                System.out.print(current + " ");
                current ++;
            }
            if (isFalse){
                break;
            }
            System.out.println();

        }
    }
}
