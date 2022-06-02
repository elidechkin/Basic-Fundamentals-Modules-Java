package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbersArr ) {
             if ( num % 2 == 0){
                 evenSum += num;
             }else   {
                 oddSum += num;
             }

        }
        System.out.println(evenSum - oddSum);
    }
}
