package NestedLoopsExe;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum ; i++) {
            String current = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < current.length() ; j++) {
                int currentNum = Integer.parseInt( "" + current.charAt(j));
                if (j % 2 == 0){
                    evenSum += currentNum;
                }else {
                    oddSum += currentNum;
                }

            }
            if (oddSum == evenSum){
                System.out.print(i + " ");
            }

        }

    }
}
