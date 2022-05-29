package NestedLoopsLab;

import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combination = 0;
        boolean isFound = false;

        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                combination ++;
                if (i + j == magicNum){
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, i, j, magicNum );
                    isFound = true;
                    break;
                }

            }
            if (isFound){
                break;
            }

        }
        if (!isFound){
            System.out.printf("%d combinations - neither equals %d", combination, magicNum);
        }

    }
}
