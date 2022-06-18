package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());// входния лист и числата, с които работим

        String[] data = scanner.nextLine().split("\\s+");// масив, за да прочем бомбата и силата й
        String bombNumber = data[0]; //изваждаме бомбата
        int power = Integer.parseInt(data[1]);// силата й
        int sum = 0;

        while (elements.contains(bombNumber)){
            int elementIndex = elements.indexOf(bombNumber);//намираме на кой индекс е бомбата

            int left = Math.max(0, elementIndex - power);
            int right = Math.min( elementIndex + power, elements.size() - 1);

            for (int i = right; i >= left; i--) {//правим фори, за да премахнем взривените от силата елементи, в ляво и
                elements.remove(i);//дясно на бомбата

            }
        }
        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());
    }
}
