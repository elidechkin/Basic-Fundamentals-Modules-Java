package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if(num < 0){
            num = num *(-1);
        }

        int totalResult = getMultipleOfEvensAndOdds(num);
        System.out.println(totalResult);

    }
    public static int getMultipleOfEvensAndOdds(int num){
        int evenSum = getSumOfEven(num);
        int oddSum = getSumOfOdd(num);
        int multiplySum = evenSum * oddSum;

        return multiplySum;

    }

    public static int getSumOfEven(int evenNum){
        int sumOfEven = 0;
        while (evenNum != 0){
            int currentNum = evenNum % 10;
            if (currentNum % 2 == 0){
                sumOfEven += currentNum;
            }
            evenNum /= 10;
        }
        return sumOfEven;
    }
    public static int getSumOfOdd(int oddNum){
        int sumOfOdd = 0;
        while (oddNum != 0){
            int currentNum = oddNum % 10;
            if (currentNum % 2 != 0){
                sumOfOdd += currentNum;
            }
            oddNum /= 10;
        }
        return sumOfOdd;
    }

}
