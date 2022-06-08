package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split(" ");
        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 0; rotation < countRotation ; rotation++) {
            String firstElement = arr[0];

            for (int index = 0; index < arr.length- 1  ; index++) {
                arr[index] = arr[index + 1];

            }
            arr[arr.length - 1] = firstElement;

        }
        for (String elements:arr) {
            System.out.print(elements + " ");

        }
    }
}
