package ForLoopExe;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= n ; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (maxNum < num){
                maxNum = num;
            }
            sum += num;


        }
        int finalSum = sum - maxNum;
        if (finalSum == maxNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs( finalSum - maxNum));
        }

    }
}
