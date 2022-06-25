package TrainingFundamentals;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        int sumAllNum = 0;

        for (Integer currentNum : numList) {
            sumAllNum += currentNum;

        }

        double averageValue = sumAllNum * 1.00 / numList.size();

        List<Integer> finalNumList = new ArrayList<>();

        for (Integer currentNumber : numList) {
            if (currentNumber > averageValue) {
                finalNumList.add(currentNumber);
            }
        }

        if (finalNumList.isEmpty()) {
            System.out.println("No");
        } else if (finalNumList.size() < 5) {
            for (Integer number : finalNumList) {
                System.out.printf("%d ", number);
            }
        } else {
            finalNumList = finalNumList.stream().limit(5).collect(Collectors.toList());

            for (Integer number : finalNumList) {
                System.out.printf("%d ", number);
            }
        }
        }

    }


