package Methods;

import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            if (isSumDivide(i) && isOddDigit(i))  {
                System.out.println(i);
            }

        }
    }

    private static boolean isSumDivide(int i) {
        int sum = 0;
        while (i > 0) {
            int currentNum = i % 10;
            sum += currentNum;

            i /= 10;
        }
        return sum % 8 == 0;

    }

    private static boolean isOddDigit(int i) {
        while (i > 0) {
            int currentNum = i % 10;
            if (currentNum % 2 == 1) {
                return true;
            }

            i /= 10;
        }
        return false;
    }
}
