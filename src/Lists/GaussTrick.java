package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sizeList = numberList.size() / 2;

        for (int i = 0; i < sizeList; i++) {
            int firstNum = numberList.get(i);
            int second = numberList.get(numberList.size() - 1);

            numberList.set(i, firstNum + second);
            numberList.remove(numberList.size() - 1);

        }
        for (int item: numberList) {
            System.out.print(item + " ");; //System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));

        }
    }
}
