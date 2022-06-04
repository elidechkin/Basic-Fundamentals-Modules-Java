package Array;

import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        int divider = 0;
        boolean flag = false;
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }
            if (leftSum == rightSum) {
                flag = true;
                divider = i;
                break;
            }
        }
        if (flag) {
            System.out.println(divider);
        } else {
            System.out.println("no");
        }
    }
}
