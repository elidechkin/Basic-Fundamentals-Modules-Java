package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxCount = 0;
        int index = 0;
        int bestSeqIndex = 0;

        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = i; j < input.length; j++) {
                if (input[i] == input[j]) {
                    count++;
                    index = i;
                    if (count > maxCount) {
                        maxCount = count;
                        bestSeqIndex = index;
                    }
                } else {
                    break;
                }

            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(input[i+bestSeqIndex] + " ");
        }

    }
}